public class RecursiveSumArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(sumArray(array,0));
    }
    public static int sumArray(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + sumArray(array, index + 1);
    }

}