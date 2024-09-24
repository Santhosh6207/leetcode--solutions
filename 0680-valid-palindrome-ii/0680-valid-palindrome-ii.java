class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        if(n==1||n==2)
          return true;
      int left=0;
      int right=s.length()-1;
      int c=0;
      while(left<=right)
      {
        if(s.charAt(left)==s.charAt(right))
          {
            left++;
            right--;
          }
          else
          {
              return isvalidPalindrome(s,left+1,right)||isvalidPalindrome(s,left,right-1);
          }
      }  
       return true; 
    }
    public boolean isvalidPalindrome(String s,int i,int j)
    {
         int left=i;
         int right=j;
         while(left<=right)
         {
            if(s.charAt(left)==s.charAt(right))
              {
                left++;
                right--;
              }
              else
               return false;
         }
         return true;
    }
}