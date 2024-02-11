package com.erdemburak.practices.questions;

import java.util.function.Predicate;

public class DetectCapital {
    public static void main(String[] args) {

        String word = "Burak";

        System.out.println(detectCapitalUse3(word));

    }

    // Case 1 - Time Complexity O(n)
    private static boolean detectCapitalUse(String word){
        int numberOfCapitals = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                numberOfCapitals++;
            }
        }
        if(numberOfCapitals == word.length() || numberOfCapitals == 0) return true;
        return numberOfCapitals == 1 && Character.isUpperCase(word.charAt(0));
    }

    // Case 2 - much better
    private static boolean detectCapitalUse2(String word){
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i = 2; i < word.length(); i++){
                if(Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
        }else {
            for(int i = 1; i < word.length(); i++) {
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    // Case 3 - Time Complexity O(n)
    private static boolean detectCapitalUse3(String word){
        if(word.length() <= 1) return true;
        Predicate<Character> currectCase = Character::isLowerCase;
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            currectCase = Character::isUpperCase;
        }
        for(int i = 1; i < word.length(); i++){
            if(!currectCase.test(word.charAt(i))) return false;
        }
        return true;
    }


}
