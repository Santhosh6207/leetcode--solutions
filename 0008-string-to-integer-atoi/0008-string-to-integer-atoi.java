class Solution {
    public int myAtoi(String s) {
       String str=s.trim(); 
       int n=+1;
       if(str.length()==0)
         return 0;
       if(str.charAt(0)=='-')
          n=-1; 
          long ans=0;
          int max=Integer.MAX_VALUE;
          int min=Integer.MIN_VALUE;
         int i=(str.charAt(0)=='-'||str.charAt(0)=='+')?1:0;
         while(i<str.length())
         {
            if(str.charAt(i)==' '||!Character.isDigit(str.charAt(i)))
              break;
              ans=ans*10+str.charAt(i)-'0';
               if(n == -1 && -1*ans <min) return min;
            if(n == 1 && ans >max) return max;
            
              i++;
         } 
         
           return (int)(n*ans);
    }
}