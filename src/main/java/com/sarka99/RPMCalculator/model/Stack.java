package com.sarka99.RPMCalculator.model;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {
    T [] stack;
    int size;
    int top;
    public Stack(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        top = -1;
    }
    public Stack() {
        this.size = 10;
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }
    public void push(T value) throws StackOverflowError {
        if(top == size-1){
            resize(size*2);
        }
        top++;
        stack[top] = value;

    }
    private void resize(int newSize){
        T[] newStack = (T[]) new Object[newSize];
        System.arraycopy(stack,0,newStack,0,top+1);
        stack = newStack;
        size = newSize;
    }

    public T pop() throws EmptyStackException {
        if(top < 0){
            throw new EmptyStackException();
        }
        T elmntToPop = stack[top];

        stack[top] = null;
        top--;

        return elmntToPop;
    }
    public String toString() {
        return "StackStatic{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + size +
                ", top=" + top +
                '}';
    }
}
