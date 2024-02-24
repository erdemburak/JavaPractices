package com.erdemburak.practices.searchalgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sıralanmış dizi: ");
        printArray(arr);
    }

    // QuickSort algoritmasının ana fonksiyonu
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Pi, partitioning index, arr[pi] artık doğru yerinde
            int pi = partition(arr, low, high);

            // Dizinin elemanlarını pi etrafında ayrı ayrı sırala
            quickSort(arr, low, pi - 1);  // Pi'den önceki elemanlar
            quickSort(arr, pi + 1, high); // Pi'den sonraki elemanlar
        }
    }

    // Bu fonksiyon pivot'u seçer, pivot elemanını doğru
    // yerine koyar ve pivot'un indeksini döndürür.
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Daha küçük elemanın indeksi
        for (int j = low; j < high; j++) {
            // Güncel eleman eğer pivot'tan küçükse veya eşitse
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (ya da pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Utility function to print the array
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
