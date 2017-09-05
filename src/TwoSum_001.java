import java.util.*;

public class TwoSum_001{
    public static void main(String args[]){
        int nums[] = {3,7,10};
        int target = 17;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println("-----------------------");
        int result[] = twoSum(nums,target);
        for(int a:result){
            System.out.println(a);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
