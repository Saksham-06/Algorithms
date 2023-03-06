import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){
        int [] array = takeInput();
        System.out.println("Enter the key to find");
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();
        System.out.println(binarySearch(array,key));
    }

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of sorted array");
        int n = s.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int binarySearch(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end)/2;
            if (arr[mid] == key){
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
