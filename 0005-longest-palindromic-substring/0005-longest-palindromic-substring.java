class Solution {
    public String longestPalindrome(String s) {
        
       int n=s.length();
       int start=0;
       int max=0;
       for(int i=0;i<n;i++)
       {
        for(int j=i;j<n;j++)
        {
            if(ispal(s,i,j)&&j-i+1>max)
            {
                start=i;
                max=j-i+1;
            }
        }
       }   
        
    return s.substring(start,start+max);
    }
    public boolean ispal(String s,int low,int high)
    {
        int n=s.length();
         
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
             return false;
             low++;
             high--;
        }
        return true;
    }

}