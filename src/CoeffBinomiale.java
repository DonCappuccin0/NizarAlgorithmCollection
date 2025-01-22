public class CoeffBinomiale {
    public static void main(String[] args) {
        System.out.println(combinazione(4,2));
    }
    public static int fattoriale(int n){
        if(n == 1){
            return n;
        }
        return n*fattoriale(n-1);
    }
    public static int combinazione(int n, int k)
    {
        return fattoriale(n)/(fattoriale(k)/fattoriale(n-k));
    }
}
