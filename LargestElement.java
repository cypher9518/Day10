package com.basicjava;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {65, 25, 6, 95, 20};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Largest element : " + max);
    }
}