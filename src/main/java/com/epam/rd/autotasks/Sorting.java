package com.epam.rd.autotasks;

public class Sorting {
   public void sort(int[] array) throws IllegalArgumentException {
        for (int i = 0; i < array.length - 1; i++) {
            int temp;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    // swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }

        }
        for (int i: array
             ) {
            System.out.println(i);
        }
    }
}
