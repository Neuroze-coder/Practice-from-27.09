//  Задание 6: Создайте игру «Камень, ножницы, бумага».
//  Оба игрока должны ввести слово rock, paper или scissors.
//  В зависимости от введенного слова программа будет определять победителя и выводить информацию об этом на экран.

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: rock, paper or scissors");
        String playerOne = scan.nextLine();
        String playerTwo = scan.nextLine();
        if (playerTwo.equals(playerOne)) {
            System.out.println("Ничья");
        } else if (playerTwo.equals("rock")&&playerOne.equals("scissors")){
            System.out.println("Player two WINS!");
        } else if (playerTwo.equals("scissors")&&playerOne.equals("paper")){
            System.out.println("Player two WINS!");
        } else if (playerTwo.equals("paper")&&playerOne.equals("rock")){
            System.out.println("Player two WINS!");
        } else {
            System.out.println("Player one WINS!");
        }
    }
}
