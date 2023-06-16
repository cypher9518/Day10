package com.basicjava;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Array in reverse elements : ");
        for(int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
