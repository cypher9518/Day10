package com.basicjava;

public class Frequency {
    public static void main(String[] args) {
        int[] n = {5, 3, 2, 5, 4, 5, 2, 2, 4, 3};
        int[] frequency = new int [n.length];
        int counted = -1;
        for(int i = 0; i < n.length; i++){
            int count = 1;
            for(int j = i+1; j < n.length; j++){
                if(n[i] == n[j]){
                    count++;
                    frequency[j] = counted;
                }
            }
            if(frequency[i] != counted)
                frequency[i] = count;
        }
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != counted)
                System.out.println("Number : "+n[i] + " Frequency Count : " + frequency[i]);
        }
    }
}