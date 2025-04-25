class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        HashMap<Integer,Long>hm=new HashMap<>();
        long result=0;
        int first=0;
        hm.put(0,1L);
        for(int num:nums)
        {
            if(num%modulo==k)
            {
                first++;
            }
            int mod=first%modulo;
            int target=(mod-k+modulo)%modulo;
            result+=hm.getOrDefault(target,0L);
            hm.put(mod,hm.getOrDefault(mod,0L)+1);
        }
        return result;
    }
}