package io.github.rahulrajsonu.coding.array;

import io.github.rahulrajsonu.coding.utils.ArrayUtils;

public class ReverseArray {
    public static void main(String[] args) {
        int[] input = new int[]{3,6,2,5,4,1};
        int[] inpu2 = new int[]{3,6,2,5,4};
        int[] inpu3 = new int[]{3,6};
        int[] inpu4 = new int[]{3};
        int[] inpu5 = new int[]{};
        reverse(input);
        reverse(inpu2);
        reverse(inpu3);
        reverse(inpu4);
        reverse(inpu5);
        ArrayUtils.printArray(input);
        ArrayUtils.printArray(inpu2);
        ArrayUtils.printArray(inpu3);
        ArrayUtils.printArray(inpu4);
        ArrayUtils.printArray(inpu5);
    }

    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++){
            int start = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = start;
        }
    }
}
