import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8,10,12};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));

    }

    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n+m];
        int i = 0, j=0, k=0;
        while(i<n && j<m){
            if (arr1[i] <= arr2[j]){
                mergedArray[k] = arr1[i];
                k++;
                i++;
            }else{
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
