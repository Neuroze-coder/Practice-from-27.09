//  Задание 2: 2642 дня записано в переменной. Определите количество лет, недель, дней.( кол-во дней вводим с клавиатуры)

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number of days");
        int days = scan.nextInt();
        int years = days/365;
        int leapDay = years/4;
        int weeksLeft = (days - ((years*365)+leapDay))/7;
        int daysLeft = days - ((years*365)+(weeksLeft*7));
        System.out.println(leapDay);
        System.out.println("You entered: " + days + " days");
        System.out.println("This: " + years + " Years " + weeksLeft + " Weeks " + daysLeft + " Days");
    }
}
