import java.util.Scanner;
public class Main {

    public static double sqrt(double x, double guess) {

        if ((guess - x / guess) < 0.0001) {
            return guess;
        } else {
            return sqrt(x, (guess + x / guess) / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        if (x < 0) {
            System.out.println("NOOOOOOO SAKNES NO 0 un -");
        } else {

            double guess = x / 2;
            System.out.println("241RDB316 Vladislav Ebert");
            System.out.printf(" %.2f\n", sqrt(x, guess));
        }
    }
}
