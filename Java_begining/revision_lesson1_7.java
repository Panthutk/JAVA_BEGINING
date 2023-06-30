import java.util.Scanner;

public class revision_lesson1_7 {
    public static void main(String[] args) {
        // revision lesson 1-7
        Scanner scan = new Scanner(System.in);

        System.out.print("type your word :");
        String word = scan.next();

        StringBuilder stbuilder = new StringBuilder();

        System.out.println(word);

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.println(Character.toLowerCase(word.charAt(i)));
                stbuilder.append(Character.toLowerCase(word.charAt(i)));

            } else if (Character.isLowerCase(word.charAt(i))) {
                System.out.println(Character.toUpperCase(word.charAt(i)));
                stbuilder.append(Character.toUpperCase(word.charAt(i)));
            }

        }

        String result = stbuilder.toString();
        System.err.println("Swap case word ;" + result);
    }
}
