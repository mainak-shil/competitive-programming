import java.util.HashMap;

// https://leetcode.com/problems/find-subarrays-with-equal-sum/
public class FindSubarraysWithEqualSum2395 {

    public static void main(String[] args) {
        int[] nums = {4, 2, 4};
        boolean subarrays = findSubarrays(nums);
        System.out.println("subarrays " + subarrays);
    }

    public static boolean findSubarrays(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i] + nums[i - 1])) {
                hashMap.put(nums[i] + nums[i - 1], nums[i] + nums[i - 1]);
            } else {
                return true;
            }
        }
        return false;
    }
}
