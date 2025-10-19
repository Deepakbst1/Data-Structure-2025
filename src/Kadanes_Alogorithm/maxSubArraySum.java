package Kadanes_Alogorithm;

import java.util.Scanner;

public class maxSubArraySum {
    public static int maxSubArraySums(int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(max, currentMax);
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int maxSum = maxSubArraySums(nums);
        System.out.println(maxSum);
    }
}
