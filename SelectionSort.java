import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,7,1,2,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i< arr.length - 1;i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;


            for(int j = i; j<arr.length;j++){
                if (arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }
}
