package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr){

        if (arr.length == 1) return arr;

        int middle = arr.length / 2;
        // copyOfRange function takes original array and range values and create a new array with a copy of the given range.
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,middle));
        int[] right = mergeSort(Arrays.copyOfRange(arr,middle,arr.length));

        return merge(left , right);
    }

    private static int[] merge(int[] first , int[] second){

        int[] mix = new int[first.length + second.length];

        int firstPointer = 0;
        int secondPointer = 0;
        int mixPointer = 0;

        while(firstPointer < first.length && secondPointer < second.length) {
            if(first[firstPointer] < second[secondPointer]) {
                mix[mixPointer] = first[firstPointer];
                firstPointer += 1;
            }
            else {
                mix[mixPointer] = second[secondPointer];
                secondPointer += 1;
            }
            mixPointer += 1;
        }

        while(firstPointer < first.length) {
            mix[mixPointer] = first[firstPointer];
            firstPointer += 1;
            mixPointer += 1;
        }

        while(secondPointer < second.length) {
            mix[mixPointer] = second[secondPointer];
            secondPointer += 1;
            mixPointer += 1;
        }
        return mix;
    }


    // This mergesort functionality does in-place sorting by changing the actual array object....
    static void mergeSortInPlace(int[] arr , int start , int end){

        if (end - start == 1) return;

        int middle = (start + end) / 2;
        mergeSortInPlace(arr,start,middle);
        mergeSortInPlace(arr,middle,end);
        mergeInPlace(arr, start, middle, end);
    }

    private static void mergeInPlace(int[] arr , int start , int middle , int end){

        int[] mix = new int[end - start];

        int firstPointer = start;
        int secondPointer = end;
        int mixPointer = 0;

        while(firstPointer < middle && secondPointer < end) {
            if(arr[firstPointer] < arr[secondPointer]) {
                mix[mixPointer] = arr[firstPointer];
                firstPointer += 1;
            }
            else {
                mix[mixPointer] = arr[secondPointer];
                secondPointer += 1;
            }
            mixPointer += 1;
        }

        while(firstPointer < middle) {
            mix[mixPointer] = arr[firstPointer];
            firstPointer += 1;
            mixPointer += 1;
        }

        while(secondPointer < end) {
            mix[mixPointer] = arr[secondPointer];
            secondPointer += 1;
            mixPointer += 1;
        }

        for (int l = 0; l < mix.length ; l++) {
            arr[start + l] = mix[l];
        }
    }

}
