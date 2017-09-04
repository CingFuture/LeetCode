import java.util.*;

public class TwoSum_001{
    public static void main(String args[]){
        int nums[] = {3,5,7,10};
        int target = 17;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println("-----------------------");
        int result[] = twoSum(nums,target);
        for(int a:result){
            System.out.println(a);
        }
    }
    public static int[] twoSum(int []nums,int target){
        int []result = new int[2];
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
