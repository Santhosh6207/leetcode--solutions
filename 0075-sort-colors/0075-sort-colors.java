class Solution {
    public void sortColors(int[] nums) {
        int c=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c++;
           else if(nums[i]==1)
            c1++;
            else
            c2++;
        }
        for(int i=0;i<c;i++)
        nums[i]=0;
        for(int i=c;i<c+c1;i++)
        nums[i]=1;
        for(int i=c+c1;i<nums.length;i++)
        nums[i]=2;
        
    }
}