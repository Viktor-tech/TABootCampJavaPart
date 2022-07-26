package com.bootcampexcercise.module2.acitivity;

public class FindInArray {
    public static void main(String[] args) {

        int[] nums = {100, 1, 4, 15};
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result) {
                result = nums[i];
            }
        }

        System.out.println("Largest array number is " + result);

    }


}





