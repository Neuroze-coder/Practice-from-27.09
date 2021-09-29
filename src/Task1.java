//  Задание 1: Напишите программу, которая будет получать от пользователя число с 5 числами.
//  Реализуйте разделение этого числа на отдельные цифры.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some number");

        int number = scan.nextInt();
        if (number >= 10000 && number <= 99999) {
            int number1 = number / 10000;
            int number2 = number / 1000 % 10;
            int number3 = number / 100 % 10;
            int number4 = number / 10 % 10;
            int number5 = number / 1 % 10;

            System.out.println("Output of a number with division: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5);

        } else {

            System.out.println("ERROR! You entered an incorrect number. Please enter a five-digit number");
        }
    }
}
