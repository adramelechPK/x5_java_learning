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
        System.out.println("Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.");
        System.out.print("Введите число и нажмите [Enter]: ");
        num = input.nextInt();
        if (num >= 0) {
            System.out.println("Ответ: " + (num++));
        } else {
            System.out.println("Ответ: " + num);
        }
    }
}
