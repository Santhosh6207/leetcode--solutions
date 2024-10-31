class Solution {
    public int longestSquareStreak(int[] nums) {
        HashMap<Long,Integer>hm=new HashMap<>();
        for(int num:nums)
        {
            hm.put((long)num,hm.getOrDefault((long)num,0)+1);
        }
        int res=-1;
        Arrays.sort(nums);
        for(int num:nums)
        {
            long t=num;
            int c=1;
            while(hm.containsKey(t*t))
            {
                c++;
                t=t*t;
                res=Math.max(res,c);
            }
        }
        return res;
        
    }
}