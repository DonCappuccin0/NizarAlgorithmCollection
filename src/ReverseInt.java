import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a%10 != 0){
            System.out.print(a%10);
            a = a /10;
        }
    }
}