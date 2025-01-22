public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("karate"));
    }
    public static String reverse(String string)
    {
        if(string.isEmpty() || string.length() ==1){
            return string;
        }

        return string.charAt(string.length() - 1) + reverse(string.substring(0, string.length() - 1));
    }
}
