class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>hm=new HashMap<>();
        HashMap<String,Character>hm1=new HashMap<>();
        String str[]=s.split(" ");
        if(pattern.length()==str.length)
        {
        for(int i=0;i<str.length;i++)
        {
            if(hm.containsKey(pattern.charAt(i)))
            {
                if(!(hm.get(pattern.charAt(i)).equals(str[i])))
                  return false;
            }
            else
            {
                hm.put(pattern.charAt(i),str[i]);
            }
            if(hm1.containsKey(str[i]))
            {
                if(!(hm1.get(str[i]).equals(pattern.charAt(i))))
                  return false;
            }
            else
            {
                hm1.put(str[i],pattern.charAt(i));
            }
        }
        }
        else
        return false;
        return true;
        
    }
}