import java.util.Scanner;
public class TakeInput{
      public static void main(String[] args)
      {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number for radious :");
        double radious =input.nextDouble();
        double area = radious * radious ;
        System.out.println("The area for the circle for radious  : "+radious+" is "+area);
}

}