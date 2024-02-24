package com.erdemburak.practices.searchalgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Verilen Dizi:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSıralanmış Dizi:");
        printArray(array);
    }

    // Diziyi sıralamak için ana mergeSort metodu
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Orta noktayı bul
            int middle = left + (right - left) / 2;

            // Sol yarıyı sırala
            mergeSort(array, left, middle);
            // Sağ yarıyı sırala
            mergeSort(array, middle + 1, right);

            // Birleştir
            merge(array, left, middle, right);
        }
    }

    // Birleştirme işlemi
    private static void merge(int[] array, int left, int middle, int right) {
        // Boyutları hesapla
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Geçici dizileri oluştur
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Veriyi geçici dizilere kopyala
        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[middle + 1 + j];

        // Geçici dizileri birleştir
        int i = 0, j = 0;

        // İlk dizin için kıyaslama noktası
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Kalan elemanları kopyala
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Dizi yazdırma yardımcı metodu
    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
