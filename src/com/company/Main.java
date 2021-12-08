package com.company;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        double[] nums = {-8.4, 2.5, -3.9, 4.678, 56.35, -46.65, -75.2, 74,5, 858,5, 57.2, -99.9, 34.2, -11.1, 22.2, -33.3};
        double res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                continue;
            }
        }

        for (double m : nums) {
            res += m;
        }

        System.out.println("Avarage is : " + res / nums.length);

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}