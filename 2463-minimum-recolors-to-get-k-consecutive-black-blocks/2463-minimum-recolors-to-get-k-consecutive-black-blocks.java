class Solution {
    public int minimumRecolors(String blocks, int k) {
        if(k>blocks.length())
         return -1;
       HashMap<Character,Integer>hm=new HashMap<>();
       for(int i=0;i<k;i++)
       { 
         char ch=blocks.charAt(i);
         hm.put(ch,hm.getOrDefault(ch,0)+1);
       } 
       
        int ans = hm.getOrDefault('W', 0);       
       int i=0,j=k;
       while(j<blocks.length())
       {
          char ch=blocks.charAt(i);
          hm.put(ch,hm.get(ch)-1);
          if(hm.get(ch)==0)
            hm.remove(ch);
            i++;
          char rch=blocks.charAt(j);
          hm.put(rch,hm.getOrDefault(rch,0)+1);
         ans = Math.min(ans, hm.getOrDefault('W', 0));
         j++;
       }
       return ans;
    }
}