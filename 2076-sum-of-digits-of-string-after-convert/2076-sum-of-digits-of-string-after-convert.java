class Solution {
    public int getLucky(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(s.charAt(i)-'a'+1);
        }
        
        String str=sb.toString();
        int n1=0;
        for(int i=0;i<str.length();i++)
        {
           n1+=Character.getNumericValue(str.charAt(i));
        }
         while(k-->1)
         {
            int ns=0;
            while(n1>0)
            {
                ns+=n1%10;
                n1/=10;
            }
            n1=ns;
         }
        return n1;
    }
}