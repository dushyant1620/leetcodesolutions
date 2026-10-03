class Solution {
    public void rotate(int[] nums, int k) {
        Solution sol = new Solution();
        k = k%nums.length;
        sol.inRotate(nums,0,nums.length-1); //[7,6,5,4,3,2,1]
        sol.inRotate(nums,0,k-1); //[5,6,7,4,3,2,1]
        sol.inRotate(nums,k,nums.length-1); //[5,6,7,1,2,3,4]
    }

    public void inRotate(int nums[],int left , int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}