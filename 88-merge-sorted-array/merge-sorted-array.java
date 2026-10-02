class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0 ;
        int[] temp = new int[nums1.length];
        int i = 0;
            while(left<m && right<n){
                if(nums1[left]>nums2[right]){
                    temp[i]=nums2[right];
                    right++; //1
                }else{
                    temp[i]=nums1[left];
                    left++; //3
                }
                i++;
            }
          while(left<m){
            temp[i]=nums1[left];
            left++;
            i++;
          }
          while(right<n){
            temp[i]=nums2[right];
            right++;
            i++;
          }
          for(int j=0;j<temp.length;j++){
            nums1[j]=temp[j];
          }
    }
}