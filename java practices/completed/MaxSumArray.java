package completed;

public class MaxSumArray {
        public int maxSubArray(int[] nums) {
            int currentSum = nums[0], maxSum = nums[0];

            for (int i =0; i < nums.length-1; i ++){
                currentSum = Math.max(nums[i], currentSum+nums[i]);
                maxSum = Math.max(currentSum, maxSum);
            }

        return maxSum;
    }
}
