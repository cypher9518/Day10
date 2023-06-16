package com.basicjava;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] array = { 15, 2, 1, 6, 21, 5 };

            Arrays.sort(array);
            System.out.println("Sorted array  : " + Arrays.toString(array));
        }
    }
