import java.util.Arrays;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1
        System.out.println("Ответ: " + taskFirst(input));

        //2
        System.out.println("Ответ: " + taskSecond(input));

        //3
        System.out.println("Ответ: " + taskThird(input));

        //4
        System.out.println("Ответ: " + taskFourth(input));

        //5
        System.out.println("Ответ: " + taskFifth(input));

        //6
        System.out.println("Ответ: " + taskSixth(input));

        //7
        System.out.println("Ответ: " + taskSeventh(input, 10));

        //8
        System.out.println("Ответ: " + taskEighth());

        //9
        System.out.println("Ответ: " + taskNinth());

        //10
        System.out.println("Ответ: " + taskTenth());
    }

    //1
    public static int taskFirst(Scanner input) {
        System.out.println("1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.");
        System.out.print("Введите число и нажмите [Enter]: ");
        int num = input.nextInt();
        return num % 10;
    }

    //2
    public static int taskSecond(Scanner input) {
        System.out.println("2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа");
        System.out.print("Введите число и нажмите [Enter]: ");
        int sum = 0, num = Math.abs(input.nextInt());
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    //3
    public static int taskThird(Scanner input) {
        System.out.println("3. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.");
        System.out.print("Введите число и нажмите [Enter]: ");
        int num = input.nextInt();
        if (num >= 0) {
            num++;
        }
        return num;
    }

    //4
    public static int taskFourth(Scanner input) {
        System.out.println("4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым то заменить его на 10. Вывести полученное число.");
        System.out.print("Введите число и нажмите [Enter]: ");
        int num = input.nextInt();
        if (num == 0) {
            num = 10;
        } else if (num > 0) {
            num++;
        } else {
            num -= 2;
        }
        return num;
    }

    //5
    public static int taskFifth(Scanner input) {
        System.out.println("5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.");
        int[] arr = new int[3];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + (i + 1) + "е число и нажмите [Enter]: ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            result = Math.min(arr[i], arr[i + 1]);
        }
        return result;
    }

    //6
    public static String taskSixth(Scanner input) {
        System.out.println("6. Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число», «положительное нечетное число» и т. д.");
        System.out.print("Введите число и нажмите [Enter]: ");
        int num = input.nextInt();
        String result;

        if (num % 2 == 0) {
            result = "четное";
        } else {
            result = "нечетное";
        }

        if (num == 0) {
            result = "нулевое";
        } else if (num > 0) {
            result = "положительное " + result;
        } else {
            result = "отрицательное " + result;
        }
        result = num + " - " + result + " число";
        return result;
    }

    //7
    public static String taskSeventh(Scanner input, int amountOfMinutes) {
        System.out.println("7. Написать программу, вычисляющую стоимость " + amountOfMinutes + " минутного междугороднего разговора в зависимости от кода города.");
        System.out.print("Введите код города и нажмите [Enter]: ");
        int num = input.nextInt();
        double costOneMinute;
        String result;
        switch (num) {
            case 905: //Москва 4.15
                costOneMinute = 4.15;
                result = "Москва. Стоимость разговора: " + costOneMinute * amountOfMinutes;
                break;
            case 194: //Ростов 1.94
                costOneMinute = 1.94;
                result = "Ростов. Стоимость разговора: " + costOneMinute * amountOfMinutes;
                break;
            case 491: //Краснодар 2.69
                costOneMinute = 2.69;
                result = "Краснодар. Стоимость разговора: " + costOneMinute * amountOfMinutes;
                break;
            case 800: //Киров 5.00
                costOneMinute = 5.00;
                result = "Киров. Стоимость разговора: " + costOneMinute * amountOfMinutes;
                break;
            default:
                result = "Неизвестный код города";
        }
        return result;
    }

    //8
    public static String taskEighth() {
        int[] inputArray = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        System.out.println("8. Работа с массивом " + Arrays.toString(inputArray) + " (максимальное | сумму положительных | сумму четных отрицательных | количество положительных | avg отрицательных");

        int max = inputArray[0], sum_pos = 0, sum_even_neg = 0, num_pos = 0, num_neg = 0;
        double avg_neg = 0;
        String result = "\n";
        for (int a : inputArray) {
            if (a > max) {
                max = a;
            }
            if (a > 0) {
                sum_pos += a;
                num_pos++;
            } else {
                num_neg++;
                avg_neg += a;
            }
            if (a < 0 && a % 2 == 0) {
                sum_even_neg += a;
            }

        }
        avg_neg /= num_neg;
        result += "максимальное значение: " + max + "\n";
        result += "сумма положительных элементов: " + sum_pos + "\n";
        result += "сумма четных отрицательных элементов: " + sum_even_neg + "\n";
        result += "количество положительных элементов: " + num_pos + "\n";
        result += "среднее арифметическое отрицательных элементов: " + avg_neg;

        return result;
    }

    //9
    public static String taskNinth() {
        int[] inputArray = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        System.out.println("9. Работа с массивом. " + Arrays.toString(inputArray) + ". Переставить элементы массива в обратном порядке. Вывести результат в консоль");

        int buff;
        for (int i = 0; i < inputArray.length; i++) {
            buff = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = buff;
            if (i == inputArray.length / 2) {
                break;
            }
        }

        return Arrays.toString(inputArray);
    }

    //10
    public static String taskTenth() {
        int[] inputArray = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.println("10. Работа с массивом. " + Arrays.toString(inputArray) + ". Переместить нули в конец массива. Вывести результат в консоль");

        int[] outputArray = new int[inputArray.length];
        int z = 0, y = 1;
        for (int a : inputArray) {
            if (a != 0) {
                outputArray[z] = a;
                z++;
            } else {
                outputArray[inputArray.length - y] = 0;
                y++;
            }
        }

        return Arrays.toString(outputArray);
    }

}
