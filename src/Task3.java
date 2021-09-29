//  Задание 3: Создайте программу, которая будет принимать число (n), введенное пользователем, и выдавать результат в виде (n + n * 2).

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some number");

        int number = scan.nextInt();
        int result = number + number * 2;
        System.out.println("You entered: " + number);
        System.out.println("Result: " + result);
    }
}
