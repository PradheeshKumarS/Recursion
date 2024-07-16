package recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {12,34,1,3,51};
        recursiveSelectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void recursiveSelectionSort(int[] arr , int lastIndex , int currIndex , int max){
        if(lastIndex == 0) return;
        if(currIndex < lastIndex){
            if(arr[currIndex] > arr[max]){
                recursiveSelectionSort(arr,lastIndex,currIndex + 1, currIndex);
            }
            else {
                recursiveSelectionSort(arr,lastIndex,currIndex + 1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[lastIndex - 1];
            arr[lastIndex - 1] = temp;
            recursiveSelectionSort(arr, lastIndex - 1, 0, 0);
        }
    }
}
