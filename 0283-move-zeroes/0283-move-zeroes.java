class Solution {
    public void moveZeroes(int[] nums) {
        // Arrays.sort(nums);
        // int count = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] == 0){
        //         count++;
        //     }
        // }
        // int k = 0;
        // int[] temp = new int[nums.length];
        // for(int i = count ; i < nums.length ; i++){
        //     temp[k++] = nums[i];
        // }
        // for(int i = 0 ; i < count ; i++){
        //     temp[k++] = nums[i];
        // }
        // for(int i = 0 ; i < nums.length ; i++){
        //     nums[i] = temp[i];
        // }
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }
        while(k < nums.length){
            nums[k++] = 0;
        }
    }
}