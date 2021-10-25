package com.epam.glava2;

import java.util.Arrays;

public class Test59Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1 ,1, 9, 4, 7, 3};
        int[] arr2 = {1 ,1, 3, 6, 5, 1};

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.compare(arr1, arr2));
        Arrays.sort(arr1);
        System.out.println(Arrays.binarySearch(arr1, 4));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
