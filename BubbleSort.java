package recursion;

import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        recursiveBubbleSort(arr , arr.length - 1 , 0);
        System.out.println(Arrays.toString(arr));

    }

    // bubble sort using recursion
    static void recursiveBubbleSort(int[] arr , int lastIndex , int currIndex){
        if(lastIndex == 0) return;
        if(currIndex < lastIndex){
            if(arr[currIndex] > arr[currIndex + 1]){
                int temp = arr[currIndex];
                arr[currIndex] = arr[currIndex + 1];
                arr[currIndex + 1] = temp;
            }
            recursiveBubbleSort(arr,lastIndex,currIndex + 1);
        }
        else{
            recursiveBubbleSort(arr , lastIndex - 1 , 0);
        }
    }
}
