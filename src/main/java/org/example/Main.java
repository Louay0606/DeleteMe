package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int[] nums ={3,1 ,5,2,1,4};
     bubbleSort(nums);
        System.out.println(Arrays.toString(nums));


    }
    public static void bubbleSort(int[] nums) {
          for( int i= 0; i< nums.length -1 ;i++){
              for (int j = 0; j < nums.length-1 -i ; j++){
                  //swap
                  int temp = nums[j];
                  nums[j] = nums[j +1];
                  nums[j +1 ] = temp;
              }

        }
    }
}
