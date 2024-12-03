class Solution {
    public int minimumOperations(int[] nums) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int num:nums)
        {
            if(num>0)
            {
            pq.offer(num);
            hs.add(num);
            }
        }  
        return hs.size();

        
    }
}