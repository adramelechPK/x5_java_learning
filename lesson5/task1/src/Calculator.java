import java.util.Scanner;

public class Calculator {

    private final String[] specs = {"\\+", "\\*", "/", "-"};
    private final LogType logType;
    private String expression;
    private boolean operator = false, firstArgNeg = false;
    private double arg1, arg2;

    public Calculator(Scanner input, LogType logType) {
        this.logType = logType;
        this.expression = input.nextLine();
        this.expression = this.expression.replaceAll(" ", "");

        if (expression.equals("exit")) {
            System.out.println("Bye Bye");
            System.exit(0);
        }

        if (this.expression.charAt(0) == '-') {
            this.expression = this.expression.substring(1);
            this.firstArgNeg = true;
        }
    }

    private void writeToLog(String message) {
        LogFactory logging = null;
        switch (this.logType) {
            case БД:
                logging = new LogБД();
                break;
            case ФАЙЛ:
                logging = new LogФайл();
                break;
            case КОНСОЛЬ:
                logging = new LogКонсоль();
                break;
            default:
        }
        logging.logWrite(message);
    }

    public void getResult() {
        String outPrefix = "Ответ: ";
        for (int i = 0; i < specs.length; i++) {
            String[] buffer = expression.split(specs[i]);
            if (buffer.length == 3 && specs[i].equals("-")) {
                try {
                    arg1 = Double.parseDouble(buffer[0]);
                    arg2 = Double.parseDouble(buffer[2]);
                } catch (Exception e) {
                    System.out.println("Аргументы не являются числами");
                    break;
                }
                if (firstArgNeg) {
                    arg1 = 0 - arg1;
                }
                arg2 = 0 - arg2;
                System.out.println(arg1 - arg2);
                operator = true;
                break;
            } else if (buffer.length == 2) {
                try {
                    arg1 = Double.parseDouble(buffer[0]);
                    arg2 = Double.parseDouble(buffer[1]);
                } catch (Exception e) {
                    System.out.println("Аргументы не являются числами");
                    break;
                }
                if (firstArgNeg) {
                    arg1 = 0 - arg1;
                }
                switch (specs[i]) {
                    case "\\+":
                        System.out.println(outPrefix + (arg1 + arg2));
                        writeToLog(expression + " = " + (arg1 + arg2));
                        break;
                    case "-":
                        System.out.println(outPrefix + (arg1 - arg2));
                        writeToLog(expression + " = " + (arg1 - arg2));
                        break;
                    case "\\*":
                        System.out.println(outPrefix + (arg1 * arg2));
                        writeToLog(expression + " = " + (arg1 * arg2));
                        break;
                    case "/":
                        System.out.println(outPrefix + (arg1 / arg2));
                        writeToLog(expression + " = " + (arg1 / arg2));
                        break;
                }
                operator = true;
                break;
            }
        }
        if (!operator) {
            System.out.println("Некорректно введено выражение");
            writeToLog("Некорректно введено выражение ( " + expression + " )");
        }
    }
}



