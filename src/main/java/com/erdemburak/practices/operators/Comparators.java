package com.erdemburak.practices.operators;

public class Comparators {
    public static void main(String[] args) {

        String name1 = "armagan";
        String name2 = "burak";
        String name3 = "burak";
        String name4 = new String("armagan");
        String name5 = new String("armagan");

        // String değişkenlerde eğer değişkeni new ile oluşturmuyorsak aynı değeri kullanan değişkenler
        // değere tek bir adresten ulaşır.
        // == operatörü değişkenlerin bellek adreslerini de kontrol eder.
        // .equals() methodu değerlerini kontrol eder.
        System.out.println("----- Strings -----");

        System.out.println(name1==name2); //False
        System.out.println(name2==name3); //True
        System.out.println(name1==name4); //False
        System.out.println(name4==name5); //False


        System.out.println("----- Integers -----");

        Integer num1 = 15;
        Integer num2 = 15;

        Integer num3 = 129;
        Integer num4 = 129;

        // Wrapper Integer -128 +127 arasındaki değerleri tek bir adresten kullanır.
        System.out.println(num1==num2); //True
        System.out.println(num3==num4); //False


    }
}
