import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {
        // for loop
        Scanner scan = new Scanner(System.in);
        String res;
        for (int i = 0; i < 5; i++) {
            System.out.print("Input your word (end to break program)");
            res = scan.next();
            if (res.equals("end")) {
                System.out.println("End of program");
                break;
            } else {
                System.out.println("input ;" + res);
            }
        }
        // while loop
        while (true) {
            System.out.print("Input your word (end to break program)");
            res = scan.next();
            if (res.equals("end")) {
                System.out.println("End of program");
                break;
            } else {
                System.out.println("input ;" + res);
            }

        }
    }
}
