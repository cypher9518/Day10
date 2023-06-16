package com.basicjava;
import java.util.Arrays;

public class SecondLargest {
     public static int Find(int[] a, int total) {
            Arrays.sort(a);
            return a[total - 2];
        }
        public static void main(String args[]) {
            int a[] = {25, 8, 91, 55, 89, 27, 31};
            System.out.println("Second Largest: " + Find(a, 7));
        }
}