class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(check(nums[i]))
            {
                c++;
            }
        }
        return c;
    }
    public boolean check(int num)
    {
        int temp=num;
        int digits=0;
        while(temp>0)
        {
             digits++;
             temp=temp/10;
        }
        return digits%2==0?true:false;
    }
}