class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<nums.length;i++)
        {
            pq.offer(new int[]{nums[i],i});
        }
        List<int[]>al=new ArrayList<>();
        while(k--!=0)
        {
            al.add(pq.poll());
        }
        Collections.sort(al,(a,b)->a[1]-b[1]);
        int res[]=new int[al.size()];
        int i=0;
        for(int[] j:al)
        {
            res[i++]=j[0];
        }
        return res;
    }
}