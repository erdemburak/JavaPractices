package com.erdemburak.practices.searchalgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(arr, target);

        if (result == -1)
            System.out.println("Target not present");
        else
            System.out.println("Target found at index " + result);
    }

    // Time complexity => O(log n)
    private static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            // Check if target is present at mid
            if(arr[mid] == target)
                return  mid;
            // If target is greater, ignore left half
            if(arr[mid] < target)
                left = mid + 1;
            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }
        // If we reach here, then the target was not present
        return -1;
    }

}
