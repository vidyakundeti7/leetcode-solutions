class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
    
        //int res=nums[0];
        for(int i=0;i<nums.length;i++){
            int temp=1;
            //maxprod=Math.max(nums[i],Math.max(nums[i]*maxprod,nums[i]*minprod));
            //minprod=Math.min(nums[i],Math.min(nums[i]*temp,nums[i]*minprod));
            //res=Math.max(res,maxprod);
            for(int j=i;j<nums.length;j++){
                temp*=nums[j];
                maxprod=Math.max(maxprod,temp);
            }

        }
        return maxprod;  
    }
}