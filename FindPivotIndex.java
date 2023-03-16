// 724. Find Pivot Index
// https://leetcode.com/problems/find-pivot-index
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 6, 5, 6};
//        int[] numbers = {1,2,3};
//        int[] numbers = {2,1,-1};
//        int[] numbers = {-1, 1, 2};
        System.out.println("final - " + pivotIndex(numbers));
    }

    public static int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int forwardSum = 0, backwardSum = 0;
        for (int i = 0; i < nums.length; i++) {
            forwardSum = calSum(nums, i + 1, nums.length);
            if (forwardSum == 0 && i==0) {
                return i;
            }
            backwardSum = calSum(nums, i - 1, 0);
            if (backwardSum == forwardSum) {
                return i;
            }
        }
        return -1;
    }

    public static int calSum(int[] nums, int i, int limit) {
        int sum = 0;
        if (limit == 0) {
            for (int k = i; k >= limit; k--) {
                sum += nums[k];
            }
        } else {
            for (int k = i; k <= limit - 1; k++) {
                sum += nums[k];
            }
        }
        return sum;
    }
}

