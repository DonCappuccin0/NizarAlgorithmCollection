public class RecursiveMCD {
    public static void main(String[] args) {
        int a = 104;
        int b = 48;
        /*while(true){
           int resto = a%b;
           a = b;
           b = resto;
           if(resto == 0){
               System.out.println("MCD is "+a);
               break;
           }
        }*/
        System.out.println("Recursive MCD is "+MCD(a,b));

    }
    public static int MCD(int a, int b){
        int resto = a%b;
        if(resto == 0){
            return b;
        }
        return MCD(b,resto);
    }
}