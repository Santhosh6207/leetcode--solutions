class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length<=1)
         return nums;
        HashMap<Integer,Integer>hm=new HashMap<>();
        //ArrayList<Integer>al=new ArrayList<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
       PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>(
        (a,b)->Integer.compare(b.getValue(),a.getValue()));
       for(Map.Entry<Integer,Integer>entry:hm.entrySet())
       {    
            pq.offer(entry);
          
          }
       
       int ar[]=new int[k];
       for(int i=0;i<k;i++)
       {
        ar[i] = pq.poll().getKey();

       }
       return ar;    }
}