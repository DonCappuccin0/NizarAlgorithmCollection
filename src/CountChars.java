import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi la parola");
        String st = sc.nextLine().toLowerCase();
        System.out.println("Scrivi il carattere da cercare");
        char c = sc.nextLine().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i) == c){
                count ++;
            }
        }
        System.out.println("La lettere "+c+" compare "+count+" volte");
    }
}
