public class RecursivAverage {
    public static void main(String[] args) {
        int[] array = {2,3,4,6,4};
        System.out.println(average(array));
    }

    public static double average(int[] array){
        int n = array.length-1;
        double sum = array[n];
        if(n==0){
           return sum;
        }

        return  average(array);
    }
}
