import java.util.HashMap;
import java.util.Map;

class TwoSum{
        public int[] twoSum(int[] nums, int target) { //my solution

            for(int i = 0; i <nums.length; i++){
                for (int j = i+1; j<=nums.length; j++){
                    if (nums[i]+nums[j] == target){
                        return new int[]{i, j};
                    }
                }
            }

        return new int[]{};
    }

    public int[] twoSumHash(int[] nums, int target){
        Map<Integer,Integer> s = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            int finder = target - nums[i];
            if (s.containsKey(finder)){
                return new int[]{i,s.get(finder)};
            }
            s.put(nums[i],i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] test = new int[]{3,2,3};
        TwoSum s = new TwoSum();
        s.twoSum(test, 6);
        System.out.println(s);
    }
}