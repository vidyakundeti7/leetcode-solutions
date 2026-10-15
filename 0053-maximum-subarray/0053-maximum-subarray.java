class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cursum=0;
        int sum=nums[0];
        for(int i=0;i<n;i++){
           
                //cur=Math.max(nums[i],cur+nums[i]);
                //sum=Math.max(sum,cur);
                if(cursum<0){
                    cursum=0;
                }
                cursum+=nums[i];
                sum=Math.max(sum,cursum);

            
        }
        return sum;
        
    }
}