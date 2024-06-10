class Solution {
    public boolean isNStraightHand(int[] ar, int groupSize) {
        int n=ar.length;
        if(n%groupSize!=0)
           return false;
        HashMap<Integer,Integer>hm=new HashMap<>();
     for(int i=0;i<n;i++)
     hm.put(ar[i],hm.getOrDefault(ar[i],0)+1);
     int [] sortedArray=new int[hm.size()];
     int index=0;
     for(int key:hm.keySet())
     {
        sortedArray[index++]=key;
     }
     Arrays.sort(sortedArray);
     for(int key:sortedArray)
     {
        if(hm.get(key)>0)
        {
            int sc=hm.get(key);
            for(int i=key;i<groupSize+key;i++)
            {
                if(hm.getOrDefault(i,0)<sc)
                return false;
                hm.put(i,hm.get(i)-sc);
            }
            
        }
     }
         

      return true;  
    }
}