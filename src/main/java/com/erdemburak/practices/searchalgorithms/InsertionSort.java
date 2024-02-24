package com.erdemburak.practices.searchalgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        insertionSort(array);
        System.out.println("Sıralanmış dizi: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;

            // Mevcut elemanı, sıralı dizideki uygun yerine yerleştir
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
    }
}
