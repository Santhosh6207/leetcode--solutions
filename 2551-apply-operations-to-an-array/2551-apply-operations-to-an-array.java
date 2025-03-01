class Solution {
    public int[] applyOperations(int[] nums) {
        
        int i=0;
        while(i<nums.length-1)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=2*nums[i];
                nums[i+1]=0;
                i++;
            }
            else
            i++;
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int num:nums)
        {
            if(num!=0)
            al.add(num);
        }
        while(al.size()!=nums.length)
        {
            al.add(0);
        }
        for(int j=0;j<al.size();j++)
        {
            nums[j]=al.get(j);
        }
        return nums;
    }
}