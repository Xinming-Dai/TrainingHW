package HW1;
public class String2 {
    public static void main(String[] args){
        String str1, str2;
        str1 = "Alan";
        str2 = "Alan";
        System.out.println(compare(str1, str2));
    }

    public static boolean compare(String str1, String str2){
        if (str1.length() != str2.length()) {
            System.out.println("Not equal");
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                System.out.println("Not equal");
                return false;
            }
        }

        System.out.println("Equal");
        return true;
    }
}
