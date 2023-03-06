import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        int num1,num2;
        num1=Inputt.nextInt();
        num2=Inputt.nextInt();
        Inputt.nextLine();
        String name1;
        name1=Inputt.nextLine();
        System.out.println(name1+(int)(num1+num2));
    }
}