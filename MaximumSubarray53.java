// https://leetcode.com/problems/maximum-subarray
// kadens problem, find max sub array
public class MaximumSubarray53 {
    public static void main(String[] args) {
        // int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = { 1, -2, -1 };
        int subArray = maxSubArray(nums);
        System.out.println("subArray is " + subArray);
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int maxSum = nums[0];
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
