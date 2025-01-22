import java.util.Scanner;

public class SumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your numbah : ");
        int a = sc.nextInt();
        int sum = 0;
        while(a%10 != 0){
            sum += a%10;
            a = a/10;
        }
        System.out.println(sum);
    }
}