class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int o=0,n,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],i);
            }
            else
            {
                o=hm.get(nums[i]);
                c=i-o;
               // n=i;
                if(c<=k)
                return true;
                else
                hm.put(nums[i],i);
            }
        }
        return false;

    }
}