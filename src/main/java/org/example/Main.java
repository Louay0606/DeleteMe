package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums, );
        System.out.println(Arrays.toString(nums));



}
    public static void bubbleSort(int[] nums){
        bubbleSort(nums,true);
    }
    public static void bubbleSort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                boolean condition = ascending
                ? nums[j] > nums[ j + 1]
                : nums[j] < nums[ j + 1];

                if (condition){

                    //swap
                    int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }

        }
    }
}
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minidx = 1;
            for (int j = i + 1; i < nums.length; j++) {
                if (nums[j] < nums[minidx]) {
                    minidx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minidx];
            nums[minidx] = temp;
        }
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
