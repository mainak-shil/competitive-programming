import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
public class TwoSum1 {
    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int[] output = twoSum(input, 9);
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] pos = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                pos[0] = hashMap.get(target - nums[i]);
                pos[1] = i;
                return pos;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return pos;
    }
}
