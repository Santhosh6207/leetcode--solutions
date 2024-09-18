class Solution {
    public char findTheDifference(String s, String t) {
       int count[]=new int[26];
       int count1[]=new int[26];
       int j=0;
       for(int i=0;i<s.length();i++)
       {
          count[s.charAt(i)-'a']++;
       }
       for(int i=0;i<t.length();i++)
       {
        count1[t.charAt(i)-'a']++;
       }
       for(int i=0;i<26;i++)
       {  
        if(count[i]!=0||count1[i]!=0)
        {
            if(count[i]!=count1[i])
            {  
                
                j=i;
            }
              System.out.println(count[i]+" "+count1[i]); 
        }
       }

       return (char)(j+'a'); 
    }
}