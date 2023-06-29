public class lesson2 {
    // variable , Data type , Operators , type casting
    public static void main(String[] args) {
        String name = "pleng";
        int num = 10;
        int num2 = 5;
        int result = num + num2;

        // float and double
        float f1 = 2.803f;
        double d2 = 2.803;
        System.out.println(name);
        System.out.println(result);
        System.out.println("result is " + result);

        // float and double
        System.out.println(f1);
        System.out.println(d2);

        // type casting
        int f1_to_int = (int) f1;
        System.out.println("f1 to int " + f1_to_int);

        String st_num = "20";
        int str_to_int = Integer.parseInt(st_num);
        System.out.println(str_to_int);
        String st_num2 = "20.34f";
        float str_to_float = Float.parseFloat(st_num2);

        System.out.println(str_to_float);

        String stint = String.valueOf(15);
        String stfloat = String.valueOf(15.34f);
        System.out.println(stint);
        System.out.println(stfloat);

    }
}
