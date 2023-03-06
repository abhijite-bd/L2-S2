import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class problem31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Enter a,b,c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = b * b - 4 * a * c;
        DecimalFormat df = new DecimalFormat("0.00000");
        if (d < 0)
            System.out.println("The equation has no real roots\n");
        else {
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            if (x1 != x2)
                System.out.println("The equation has two roots " + df.format(x1) + " and " + df.format(x2));
            else
                System.out.println("The equation has one root " + df.format(x1));
        }
    }
}
