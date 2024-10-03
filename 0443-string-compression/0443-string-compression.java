class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)
           return 1;
           StringBuilder sb=new StringBuilder();

       int index=0;
       int i=0;
       int n=chars.length;
       int c=0;
       while(i<n)
       {
        char ch=chars[i];
           c=0;
           while(i<n&&chars[i]==ch)
           {
            c++;
            i++;
           }
           chars[index]=ch;
           index++;
           if(c>1)
           {
              String str=Integer.toString(c);
              for(int j=0;j<str.length();j++)
              {
                chars[index++]=str.charAt(j);
              }
           }
          
    }
     return index;
}
}