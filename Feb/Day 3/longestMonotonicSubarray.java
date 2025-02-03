class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max1=1,max2=1;
        int inc=1,dec=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                inc++;
                max1=Math.max(max1,inc);
                dec=1;
            }
            else if(nums[i]==nums[i+1]){
                inc=1;
                dec=1;
            }
            else{
                dec++;
                max2=Math.max(max2,dec);
                inc=1;
            }
        }
        return Math.max(max1,max2);
    }
}
