public class StrOps {
    public static void main(String[] args) {
        String str1 =
                "When it comes to web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java is Powerful.";

        int result, idx;
        char ch;

        System.out.println("Length os str1: " + str1.length());

        for (int i = 0; i < str1.length(); i++){
            System.out.println(" " + str1.charAt(i));
        }

        if (str2.equals(str1)){
            System.out.println("str2 equals str1");
        } else {
            System.out.println("str2 does not equal str1");
        }


        String str4 = "three";
        String str5 = "four";
        String str6 = "five";

        String str7 = str4 + str5 + str6;
    }
}
