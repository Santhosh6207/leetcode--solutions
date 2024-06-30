class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
          return false;
         if(s1.equals(s2))
         return true;
         int count[]=new int[26];
         int count1[]=new int[26];
         int c=0;
         for(int i=0;i<s1.length();i++)
         {
              if(s1.charAt(i)!=s2.charAt(i))
                c++;
                if(c>2)
                return false;
            count[s1.charAt(i)-'a']++;
            count1[s2.charAt(i)-'a']++;
         }
         
        

        return Arrays.equals(count,count1);
    }
}