import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LogType logType = logTypeSelection();

        header();

        while (true) {
            System.out.print("Введите выражение и нажмите [Enter]: ");
            Scanner input = new Scanner(System.in);

            Calculator calculator = new Calculator(input, logType);
            calculator.getResult();

        }
    }

    public static LogType logTypeSelection() {
        LogType logType = null;

        System.out.println("Какой тип логирования?");
        System.out.println(Arrays.toString(LogType.values()));
        Scanner sc = new Scanner(System.in);

        try {
            logType = LogType.valueOf(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого типа логирования");
            System.exit(0);
        }

        return logType;
    }

    public static void header() {
        System.out.println("Калькулятор.");
        System.out.println();
        System.out.println("Программа выполняет арифметические выражения над действительными");
        System.out.println("числами и поддерживает следующие операции: +, -, *, /.");
        System.out.println("Для завершения работы программы введите \"exit\" [Enter].");
    }
}
