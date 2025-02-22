class Solution {
    public int[] getAverages(int[] nums, int k) {
            if(k==0 && nums.length==1)
              return nums;

           long prefix_sum[]=new long[nums.length+1];
           int avg_sum[]=new int[nums.length];
           int divisor=2*k+1;
            Arrays.fill(avg_sum,-1);
           if(nums.length<divisor)
               return avg_sum;
          // prefix_sum[0]=nums[0];
           for(int i=0;i<nums.length;++i)
           {
                prefix_sum[i+1]=nums[i]+prefix_sum[i];
           }
          
           for(int i=k;i+k<nums.length;++i)
           {
            avg_sum[i]=(int)((prefix_sum[i+k+1]-prefix_sum[i-k])/divisor);
           }
         return avg_sum;  
    }
}