
//used for import scanner
import java.util.Scanner;
//used for mathematics
import java.lang.Math;

public class lesson5 {
    public static void main(String[] args) {

        // scanner input

        Scanner scan = new Scanner(System.in);
        System.out.print("type your name :");
        String name = scan.nextLine();
        System.out.println(String.format("your name is : %s", name));
        System.out.print("Type your age");
        int age = scan.nextInt();
        System.out.println(String.format("your age ; %d", age));

        // math
        double a = 2;
        double b = 6;
        double c = Math.pow(a, b);
        System.out.println("c : " + c);

    }
}