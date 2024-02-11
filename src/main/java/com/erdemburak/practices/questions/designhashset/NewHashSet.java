package com.erdemburak.practices.questions.designhashset;

public class NewHashSet {

    // Time Complexity => O(1)
    // Space Complexity => O(N)

    boolean[] arr;

    protected NewHashSet(){
        arr = new boolean[1000001];
    }

    protected void add(int key){
        arr[key] = true;
    }

    protected void remove(int key){
        arr[key] = false;
    }

    protected boolean contains(int key){
        return arr[key];
    }


}
