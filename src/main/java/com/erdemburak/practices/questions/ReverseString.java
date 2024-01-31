package com.erdemburak.practices.questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println(reverseWithStringBuilder(str));
        System.out.println(reverseManually(str));
        System.out.println(reverseWithStreamApi(str));
    }

    //String Builder ile ters çevirme işlemi
    private static String reverseWithStringBuilder(String str){
        return new StringBuilder(str)
                .reverse()
                .toString();
    }
    //Manuel olarak for döngüsü ile ters çevirme işlemi
    private static String reverseManually(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() -1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Stream Api ile ters çevirme işlemi
    private static String reverseWithStreamApi(String str){
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(StringBuilder::new, (sb, c) -> sb.insert(0, c), StringBuilder::append)
                .toString();
    }

}
