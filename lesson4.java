public class lesson4 {
    public static void main(String[] args) {

        // String format
        String item = "apple";
        int total = 5;
        System.out.println(String.format("I have %s total = %d", item, total));

        // String charAt
        String word = "Hello test apple is red";
        System.out.println(word.charAt(4));

        // indexof find text position
        System.out.println(word.indexOf("o"));
        System.out.println("Find o place? : " + word.indexOf("o"));

        // substring
        System.out.println(word.substring(6, 10));
        System.out.println(word.substring(word.indexOf("test"), 10));
        System.out.println(word.substring(word.indexOf("test"), word.indexOf("test") + 4));

        // length
        String p = "test";
        System.out.println(p.length());
        System.out.println("hello world".length());

        // Containing find word
        System.out.println(word.contains("is"));

        // Lowercase
        String lower_word = word.toLowerCase();
        System.out.println(lower_word);

        // Upper case
        String Upper_word = word.toUpperCase();
        System.out.println(Upper_word);

        // Replace all
        String rep = "Apple is red isn't blue";
        String repx = rep.replaceAll("is", "was");
        System.out.println(repx);
    }
}