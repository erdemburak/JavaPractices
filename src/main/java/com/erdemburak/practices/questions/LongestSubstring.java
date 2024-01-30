package com.erdemburak.practices.questions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcadsabcbb";

        String longestSubstring = findLongestUniqueSubstring(input);

        System.out.println("En uzun benzersiz substring: " + longestSubstring);
    }

    private static String findLongestUniqueSubstring(String s) {
        // Sliding window yöntemi için sol ve sağ indeksler
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int start = 0;

        // benzersiz karakterleri takip etmek için set
        Set<Character> uniqueChars = new HashSet<>();

        // Sağ indeks string length'inden küçük olduğu sürece devam
        while (right < s.length()){
            // Sağ indeks'in gösterdiği değer set içerisinde yoksa
            if (!uniqueChars.contains(s.charAt(right))){
                uniqueChars.add(s.charAt(right)); // ekle
                // Mevcut substring uzunluğu
                int currentLen = right - left + 1;
                // Mevcut substring uzunluğu maxlen den büyükse maxlen'i güncelle
                if(currentLen > maxlen){
                    maxlen = currentLen;
                    start = left;
                }
                // Sağ indeksi ilerlet
                right++;
            }else {
                // Karakter daha önce görülmüşse
                // Sol indeksi bir karakter sağa kaydır ve set'ten çıkar
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }
        // En uzun benzersiz substring'i döndür
        return s.substring(start,start+maxlen);
    }
}
