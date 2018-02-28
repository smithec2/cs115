package edu.ldsbc.data.structures.and.search;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {

    public static void main(String[] args) {
        int[] arrayInt = {9, 5, 3, 7, 1};
        Arrays.sort(arrayInt);

        System.out.println("This is my sorted array --> " + Arrays.toString(arrayInt));




        int[] array = new int[50000000];
        Random rand = new Random();

        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        //System.out.println("This is my unsorted array --> " + Arrays.toString(array));

        Arrays.sort(array);

        //System.out.println("This is my sorted array --> " + Arrays.toString(array));

        System.out.println(System.nanoTime() - startTime);

    }
}
