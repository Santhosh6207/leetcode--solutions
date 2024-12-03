class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:stones)
        {
            pq.offer(num);
        }
        while(pq.size()>1)
        {
            int x=pq.poll();
            int y=pq.poll();
            if(x==y)
              continue;
            else
            {
                pq.offer(x-y);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}