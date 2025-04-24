class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int num:nums)
        hs.add(num);
         int k=hs.size();
         int c=0;
        for(int i=0;i<nums.length;i++)
        {     
            HashSet<Integer>hs1=new HashSet<>();
             for(int j=i;j<nums.length;j++)
            {
                hs1.add(nums[j]);
                if(hs1.size()==k)
                c++;
            }

        }
        return c;
    }
}