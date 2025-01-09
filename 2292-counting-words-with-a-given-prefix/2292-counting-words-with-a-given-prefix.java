class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        int n=pref.length();
        for(int i=0;i<words.length;i++)
        {   
            if(check(words[i],pref))
            {
                c++;
            }  
        }
        return c;
    }
    public boolean check(String str,String pref)
    {    if(str.length()<pref.length())
              return false;
         int i=0,j=0;     
           while(i<str.length()&&j<pref.length())
            {
                if(str.charAt(i)!=pref.charAt(j))
                  return false;
                  i++;
                  j++;
            }
         return true;
    }
}