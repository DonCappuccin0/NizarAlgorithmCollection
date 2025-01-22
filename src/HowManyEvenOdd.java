import java.util.Scanner;
public class HowManyEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your numbah : ");
        int a = scanner.nextInt();
        int even = 0;
        int odd = 0;
        while(a%10 != 0) {
            if(a%10%2==0){
                even++;
            }else{
                odd++;
            }
            a = a/10;
        }
        System.out.println(
                "Ci sono " + even + " numeri pari"
                + "e  " + odd + " numeri dispari"
        );
    }
}
