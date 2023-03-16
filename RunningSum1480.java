import java.util.Arrays;

//1480. Running Sum of 1d Array
//https://leetcode.com/problems/running-sum-of-1d-array/submissions/
public class RunningSum1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("final --> " + Arrays.toString(runningSum(nums)));
    }


    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

