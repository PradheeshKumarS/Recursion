// This program finds whether an element is present in the array or not using recursion....

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[] {12,34,56,78} , 56 , 0));
        System.out.println(searchIndex(new int[] {12,34,56,78} , 56 , 0));
    }

    public static boolean search(int[] arr , int target , int index){
        if(index == arr.length) return false;
        return arr[index] == target || search(arr, target , index + 1);
    }

    public static int searchIndex(int[] arr , int target , int index){
        if(index == arr.length) return -1;
        if(arr[index] == target){
            return index;
        }else{
            return searchIndex(arr, target , index + 1);
        }
    }
}
