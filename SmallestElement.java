package com.basicjava;

public class SmallestElement {
    public static void main(String[] args) {
        int[] array = {32, 27, 69, 3, 18};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("Largest element : " + min);
    }
}
