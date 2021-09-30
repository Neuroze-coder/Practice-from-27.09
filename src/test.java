import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter number of days");
        int Enterdays = enter.nextInt();
        int years = Enterdays / 365;
        int remainingDaysOfTheYear = Enterdays % 365;
        int weeks = remainingDaysOfTheYear / 7;
        int remainingDaysOfTheWeek = weeks % 7;
        int days = remainingDaysOfTheWeek;
        System.out.println(years + " Years, " + weeks+ " weeks, " + days + " days.");
        System.out.println(remainingDaysOfTheYear);
    }
}
