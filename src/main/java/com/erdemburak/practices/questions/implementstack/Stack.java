package com.erdemburak.practices.questions.implementstack;

public class Stack {
    private int array[];
    private int top;
    private int capacity;

    Stack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    protected boolean isEmpty(){
        return top == -1;
    }

    protected boolean isFull(){
        return top == capacity - 1;
    }

    protected void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }
    protected int pop(int item){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }
    protected int peek(int item){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

}
