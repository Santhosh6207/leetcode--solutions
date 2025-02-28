class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        //HashMap<Integer,Integer>hm1=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                hm.put(nums[i]*nums[j],hm.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        for(int count:hm.values())
        {
            if(count>1)
             c+=(count*(count-1)*4);
        }
        return c;
    }
}