class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])<3){
                nums[j] = nums[i];
                j++;
            }
        }
            return j;
    }
}