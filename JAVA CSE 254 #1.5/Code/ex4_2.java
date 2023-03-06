import java.util.Scanner;

public class ex4_2 {

  public static void main(String[] args) {
    double rad, x1, x2, y1, y2;
    rad = 6371.01;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter point 1 (latitude and longitude) in degrees:");
    x1 = input.nextDouble();
    y1 = input.nextDouble();
    System.out.println("Enter point 2 (latitude and longitude) in degrees:");
    x2 = input.nextDouble();
    y2 = input.nextDouble();
    
    double x1rad = Math.toRadians(x1);
    double y1rad = Math.toRadians(y1);
    double x2rad = Math.toRadians(x2);
    double y2rad = Math.toRadians(y2);
    double dis =
      rad *
      Math.acos(
        Math.sin(x1rad) *
        Math.sin(x2rad) +
        Math.cos(x1rad) *
        Math.cos(x2rad) *
        Math.cos(y1rad - y2rad)
      );
    System.out.println("The distance between the two points is " + dis + " km");
  }
}
