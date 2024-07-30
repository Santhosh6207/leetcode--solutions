class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            hm.put(ch[i],hm.getOrDefault(ch[i],0)+1);
        }
        List<Map.Entry<Character,Integer>>al=new ArrayList<>(hm.entrySet());
        Collections.sort(al,(a,b)->
           b.getValue().compareTo(a.getValue()));

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer>entry:al)
        {
            int freq=entry.getValue();
            char c=entry.getKey();
            for(int i=0;i<freq;i++)
            sb.append(c);
        }


       return sb.toString(); 
    }
}