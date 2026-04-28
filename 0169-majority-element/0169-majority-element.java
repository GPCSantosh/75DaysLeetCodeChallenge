class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        // int n = nums.length;
        // int max = 0, count = 0;
        // int[] temp = new int[n];
        // for(int i = 0 ; i < n ; i++){
        //     temp[i] = 0;
        // }
        // for(int i = 1 ; i < n ; i++){
        //     if(nums[i] != nums[i-1]){
        //         temp[k++] = nums[i];
        //     }
        // }
        // for(int i = 1 ; i < n ; i++){
        //     max = Math.max(temp[i], temp[i-1]);
        // }
        // for(int i = 1 ; i < n ; i++){
        //     if(nums[i] == nums[i-1]){
        //         count++;
        //     }
        //     else{
        //         count = 0;
        //     }
        // }
        // return count;
        return nums[nums.length / 2];
    }
}