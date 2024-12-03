class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<piles.length;i++)
        {
            pq.offer(piles[i]);
        }
        while(k-->0)
        {
          int maxPile = pq.poll(); 
            int reducedPile = maxPile - (maxPile / 2); 
            pq.offer(reducedPile); 
            
        }
        int sum=0;
        while(!pq.isEmpty())
        {
            sum+=pq.poll();
        }
        return sum;
    }
}