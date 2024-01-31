package com.erdemburak.practices.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int target = 9;
        System.out.println(getTwoSum(numbers,target));
    }

    // İki sayının toplamının hedef değere eşit olup olmadığını kontrol eden metod.
    // Eğer bulunursa, bu iki sayının indisleri bir liste olarak döndürülüyor.
    private static List<Integer> getTwoSum(List<Integer> arr, int target){
        // Ziyaret edilen sayıların ve indislerin tutulduğu bir HashMap.
        Map<Integer,Integer> visitedNumbers = new HashMap<>();

        // Eğer delta, daha önce ziyaret edilen sayılar arasında bulunuyorsa,
        // iki sayının indisleri bir liste olarak döndürülüyor.
        for(int i = 0; i < arr.size(); i++){
            int delta = target - arr.get(i);
            if(visitedNumbers.containsKey(delta)){
                return Arrays.asList(i,visitedNumbers.get(delta));
            }
            // Eğer delta, daha önce görülmemişse, bu sayının değeri ve indis bilgisi
            // HashMap'e ekleniyor.
            visitedNumbers.put(arr.get(i), i);
        }
        // Eğer hiçbir eşleşme bulunamazsa, bir liste [-1, -1] döndürülüyor.
        return Arrays.asList(-1,-1);
    }
}
