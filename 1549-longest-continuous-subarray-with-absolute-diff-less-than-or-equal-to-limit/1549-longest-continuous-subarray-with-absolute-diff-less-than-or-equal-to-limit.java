class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left=0;
        int right=0;
        int maxi=0;
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        int n=nums.length;
        while(right<n)
        {    
            tm.put(nums[right],tm.getOrDefault(nums[right],0)+1);
            while(tm.lastKey()-tm.firstKey()>limit&&left<=right)
            {
                tm.put(nums[left],tm.get(nums[left])-1);
                if(tm.get(nums[left])==0)
                   tm.remove(nums[left]);
                   left++;
            }
            maxi=Math.max(maxi,right-left+1);
            right++;
        }
        return maxi;
    }
}