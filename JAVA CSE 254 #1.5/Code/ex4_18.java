import java.util.Scanner;

public class ex4_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        // System.out.println(s);
        if(s.equals("I1"))
        System.out.println("Information Management Freshman");
        else if(s=="I2")
        System.out.println("Information Management Sophomore");
        else if(s.equals("I3"))
        System.out.println("Information Management Junior");
        else if(s.equals("I4"))
        System.out.println("Information Management Senior");

        else if(s.equals("C1"))
        System.out.println("Computer Science Freshman");
        else if(s.equals("C2"))
        System.out.println("Computer Science Sophomore");
        else if(s.equals("C3"))
        System.out.println("Computer Science Junior");
        else if(s.equals("C4"))
        System.out.println("Computer Science Senior");

        else if(s.equals("A1"))
        System.out.println("Accounting Freshman");
        else if(s.equals("A2"))
        System.out.println("Accounting Sophomore");
        else if(s.equals("A3"))
        System.out.println("Accounting Junior");
        else if(s.equals("A4"))
        System.out.println("Accounting Senior");

        else
        System.out.println("Invalid input");
        
    }
    
}
