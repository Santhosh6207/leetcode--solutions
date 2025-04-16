class Solution {
    public long countGood(int[] nums, int k) {
       long count=0;
       Map<Integer,Integer>hm=new HashMap<>();
       int left=0;
       for(int i=0;i<nums.length;i++)
       {
        k-=hm.getOrDefault(nums[i],0);
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        while(k<=0)
        {
            hm.put(nums[left],hm.get(nums[left])-1);
            k+=hm.get(nums[left++]);
        }
        count+=left;
       }
       return count;
    }
}