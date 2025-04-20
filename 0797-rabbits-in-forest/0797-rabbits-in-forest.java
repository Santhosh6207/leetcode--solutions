class Solution {
    public int numRabbits(int[] answers) {
     Map<Integer,Integer>hm=new HashMap<>();
     for(int num:answers)
     {
        hm.put(num,hm.getOrDefault(num,0)+1);
     }
     int ans=0;
     for(Map.Entry<Integer,Integer>entry:hm.entrySet())
     {
       ans += (int)Math.ceil((double)entry.getValue() / (entry.getKey() + 1)) * (entry.getKey() + 1);
   }
     return ans;
    }
}