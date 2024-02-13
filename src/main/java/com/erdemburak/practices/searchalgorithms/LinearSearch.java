package com.erdemburak.practices.searchalgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 12, 24, 20, 35, 36};
        int target = 12;
        int result = linearSearch(arr, target);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i; // Return the index of the target if found
        }
        return -1; // Return -1 if the target is not found in the array
    }
}
