class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str1=paragraph.toLowerCase().replaceAll("[^a-zA-Z]"," ");
        String str[]=str1.split("\\s+");
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            hm.put(str[i],hm.getOrDefault(str[i],0)+1);
        }
        for(String ban:banned)
        {
            if(hm.containsKey(ban))
            hm.remove(ban);
        }
        int fmax=0;
      String ans="";
      for(Map.Entry<String,Integer>entry:hm.entrySet())
      {
        int q=entry.getValue();
        if(q>fmax)
        {   fmax=q;
            ans=entry.getKey();
        }
      }
      return ans;

    }
}