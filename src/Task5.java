//  Задание 5: Даны координаты точки и радиус круга с центром в начале координат.
//  Определить, принадлежит ли данная точка кругу.

public class Task5 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int r = 2; // r = radius
        double r_xy = Math.sqrt(x * x + y * y); // r_xy = hypotenuse
        if (r_xy <= r) {
            System.out.println("Точка принадлежит кругу");
        } else {
            System.out.println("Точка вне круга");
        }

    }
}