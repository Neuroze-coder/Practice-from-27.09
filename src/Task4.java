//  Задание 4: Проверить две переменные на их четность. Если обе четные, то выдается значение true, иначе false.

public class Task4 {
    public static void main(String[] args) {
        System.out.println(divisionByTwo(100, 100));
    }

    static boolean divisionByTwo(int firstVariable, int secondVariable) {
        if (firstVariable % 2 == 0 && secondVariable % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
