class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        double maxe = sum;
        for(int j = k ; j < nums.length ; j++){
            sum = sum- nums[j-k] + nums[j];
            maxe = Math.max(maxe, sum);
        }
        return maxe/k;
    }
}