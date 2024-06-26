class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int c=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
           sum+=nums[i];
           int r=sum-goal;
           if(hm.containsKey(r))
           c+=hm.get(r);
           hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return c;
    }
}