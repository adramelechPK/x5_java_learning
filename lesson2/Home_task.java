package lesson2;

import java.util.Scanner;

public class Home_task {
    public static void main(String[] args) {

        //1
        System.out.println("1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.");
        System.out.print("Введите число и нажмите [Enter]: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Ответ: " + (num % 10));

        //2
        System.out.println("2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа");
        System.out.print("Введите число и нажмите [Enter]: ");
        num = input.nextInt();
        System.out.println("Ответ: " + (num / 100 + num % 100 / 10 + num % 10));

        //3
        System.out.println("3. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.");
        System.out.print("Введите число и нажмите [Enter]: ");
        num = input.nextInt();
        if (num >= 0) {
            num++;
        }
        System.out.println("Ответ: " + num);

        //4
        System.out.println("4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым то заменить его на 10. Вывести полученное число.");
        System.out.print("Введите число и нажмите [Enter]: ");
        num = input.nextInt();
        if (num == 0) {
            num = 10;
        } else if (num >0) {
            num++;
        } else {
            num -= 2;
        }
        System.out.println("Ответ: " + num);

        //5
        System.out.println("5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.");
        System.out.print("Введите 1е число и нажмите [Enter]: ");
        num = input.nextInt();
        System.out.print("Введите 2е число и нажмите [Enter]: ");
        int num1 = input.nextInt();
        System.out.print("Введите 3е число и нажмите [Enter]: ");
        int num2 = input.nextInt();
        int temp;
        if (num <= num1 && num <= num2 ) {
            temp = num;
        } else if (num1 <= num2) {
            temp = num1;
        } else {
            temp = num2;
        }
        System.out.println("Ответ: " + temp);

        //6
        System.out.println("6. Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число», «положительное нечетное число» и т. д.");
        System.out.print("Введите число и нажмите [Enter]: ");
        num = input.nextInt();
        String temp_str = "";

        if ( num % 2 == 0) {
            temp_str = "четное";
        } else {
            temp_str = "нечетное";
        }

        if (num == 0 ) {
            temp_str = "нулевое";
        } else if (num > 0) {
            temp_str = "положительное " + temp_str;
        } else {
            temp_str = "отрицательное " + temp_str;
        }
        System.out.println("Ответ: " + num + " - " + temp_str + " число");

        //7
        System.out.println("7. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.");
        System.out.print("Введите код города и нажмите [Enter]: ");
        num = input.nextInt();
        double min_cost;
        switch (num){
            case 905: //Москва 4.15
                min_cost = 4.15;
                System.out.println("Москва. Стоимость разговора: " + min_cost*10);
                break;
            case 194: //Ростов 1.94
                min_cost = 1.94;
                System.out.println("Ростов. Стоимость разговора: " + min_cost*10);
                break;
            case 491: //Краснодар 2.69
                min_cost = 2.69;
                System.out.println("Краснодар. Стоимость разговора: " + min_cost*10);
                break;
            case 800: //Киров 5.00
                min_cost = 5.00;
                System.out.println("Киров. Стоимость разговора: " + min_cost*10);
                break;
            default:
                System.out.println("Неизвестный код города");
        }

        //8
        System.out.println("8. Работа с массивом [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. (максимальное | сумму положительных | сумму четных отрицательных | количество положительных | avg отрицательных");
        int[] arr8 = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int max = arr8[0], sum_pos = 0, sum_even_neg = 0, num_pos = 0, num_neg = 0;
        double avg_neg = 0;
        for (int a:arr8 ) {
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
            if ( a < 0 && a % 2 == 0) {
                sum_even_neg += a;
            }

        }
        avg_neg /= num_neg;

        System.out.println("Ответ:");
        System.out.println("максимальное значение: " + max);
        System.out.println("сумма положительных элементов: " + sum_pos);
        System.out.println("сумма четных отрицательных элементов: " + sum_even_neg);
        System.out.println("количество положительных элементов: " + num_pos);
        System.out.println("среднее арифметическое отрицательных элементов: " + avg_neg);

        //9
        System.out.println("9. Работа с массивом. [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52]. Переставить элементы массива в обратном порядке. Вывести результат в консоль");
        int[] arr9 = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int buff;
        for (int i=0; i < arr9.length; i++) {
            buff = arr9[i];
            arr9[i] = arr9[arr9.length - i - 1];
            arr9[arr9.length - i - 1] = buff;
            if (i == arr9.length / 2) {
                break;
            }
        }
        System.out.print("Массив наоборот: ");
        for (int a:arr9) {
            System.out.print(a + " ");
        }
        System.out.println("");

        //10
        System.out.println("10. Работа с массивом. [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить нули в конец массива. Вывести результат в консоль");
        int[] arr10 = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int[] temp_arr = new int[arr10.length];
        int index = arr10.length,z = 0,y = 1;
        for (int i=0; i < arr10.length; i++) {
            if (arr10[i] != 0) {
                temp_arr[z] = arr10[i];
                z++;
            } else {
                temp_arr[arr10.length-y] = 0;
                y++;
            }
        }

        System.out.print("Ответ: ");
        for (int a:temp_arr) {
            System.out.print(a + " ");
        }
        System.out.println();

    }
}
