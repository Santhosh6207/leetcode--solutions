class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)
           return 1;
           //StringBuilder sb=new StringBuilder();
       int index=0;
       int n=chars.length;
       int count=1;
       for(int i=1;i<n;i++)
       {
          if(chars[i]==chars[i-1])
          {
            count++;
          }
          else
          {
            if(count<2)
            {
                chars[index++]=chars[i-1];
            }
            else
            {
                chars[index++]=chars[i-1];
                if(count<10)
                {
                    chars[index++]=(char)('0'+count);
                }
                else
                {
                    String str=Integer.toString(count);
                    for(char ch1:str.toCharArray())
                    {
                        chars[index++]=ch1;
                    }
                }
            }
            count=1;
          }
       }
       chars[index++]=chars[n-1];
       if (count > 1) {
            for (char ch : Integer.toString(count).toCharArray()) {
                chars[index++] = ch;
            }
        }
     return index;
}
}