import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        // if else if else
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your score");
        int score = scan.nextInt();
        /* A = 80-100 , B+ = 75-80 , B = 70-75 , C = 65-70 */
        if (score >= 80) {
            System.out.println("Your Grade is A Excellent");

        } else if (score >= 75 && score < 80) {
            System.out.println("Your Grade is B+ Excellent");
        } else if (score >= 70 && score < 75) {
            System.out.println("Your Grade is B Excellent");
        } else if (score >= 60 && score < 65) {
            System.out.println("Your Grade is C Excellent");
        } else {
            System.out.println("unknown input");
        }
    }
}
