public class lesson3 {

    public static void main(String[] args) {

        // string format
        int num_apple = 5;
        String color = "red ";
        System.out.println(String.format("Apple is %s I have %d of them", color, num_apple));

        // string contains find word in string
        String sentence = "Hello I'm pleng";
        System.out.println(sentence.contains("pleng"));

        // charAt pick one character in string position that you want
        System.out.print(sentence.charAt(0));

        // sentence sub string used to cut string in position that i set
        System.out.println(sentence.substring(1, 4));

        // String trim cut /n /t /r or gap between left and right
        String s2 = "\n\tApple ";
        System.out.println(s2.trim());

        // length
        String s3 = "apple";
        System.out.println(s3.length());

        // replace word with other
        String s1 = "my name is bobby kayee pak";
        String replString = s1.replaceAll("is", "was");
        System.out.println(replString);

        // find the firt word position in string
        String myStr = "Hello planet earth, you are a great planet";
        System.out.println(myStr.indexOf("planet"));
    }
}
