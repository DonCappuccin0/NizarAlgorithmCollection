public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2,4,1,0,7,3};
        int[] sortedArray = selectionSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }
    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            for (int j = i+1; j < array.length; j++) {
                if(temp>array[j]){
                    array[i] = array[j];
                    array[j]=temp;
                    temp=array[i];
                }
            }
        }
        return array;
    }
}
