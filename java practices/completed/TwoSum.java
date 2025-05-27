package completed;

import java.util.HashMap;
import java.util.Map;

class TwoSum{
    //     public int[] twoSum(int[] nums, int target) { //my solution

    //         for(int i = 0; i <nums.length; i++){
    //             for (int j = i+1; j<=nums.length; j++){
    //                 if (nums[i]+nums[j] == target){
    //                     return new int[]{i, j};
    //                 }
    //             }
    //         }

    //     return new int[]{};
    // }

    public int[] twoSumHash(int[] nums, int target){

        // HashMap to collect unique integers
        Map<Integer,Integer> s = new HashMap<>();

        //loop through nums array
        for (int i = 0; i< nums.length; i++){

            // find if the targeted combo numbers exist by subtraction
            int finder = target - nums[i];

            //if a combination is found, return the combination position
            if (s.containsKey(finder)){
                return new int[]{i,s.get(finder)};
            }

            //put the number into map by <integer, position>
            s.put(nums[i],i);
        }

        return new int[]{};
    }
}