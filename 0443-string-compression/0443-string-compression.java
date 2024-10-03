class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)
           return 1;
           //StringBuilder sb=new StringBuilder();
       int index=0;
       int n=chars.length;
       int c=1;
        for(int i=1;i<n;i++)
        
        {
            if(chars[i]==chars[i-1])
            {
                c++;
            }
           else
           {  
             chars[index++]=chars[i-1];
           if(c>1)
           {
              String str=Integer.toString(c);
              for(int j=0;j<str.length();j++)
              {
                chars[index++]=str.charAt(j);
              }
              
           }
           c=1;
           }
        }
          chars[index++] = chars[n - 1];
        if (c > 1) {
            String str = Integer.toString(c);
            for (int j = 0; j < str.length(); j++) {
                chars[index++] = str.charAt(j);
            }
        } 
    
     return index;
}
}