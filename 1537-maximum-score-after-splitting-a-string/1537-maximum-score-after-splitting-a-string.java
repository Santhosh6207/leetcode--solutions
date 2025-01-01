class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int maxi=Integer.MIN_VALUE;
        String str="";
        String str1="";
        for(int i=0;i<n-1;i++)
        {
            str=s.substring(0,i+1);
            str1=s.substring(i+1,n);
            int sum=check(str,str1); 
            System.out.println(sum);
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
    public int check(String str,String str1)
    {
        int c=0;
        int c1=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
             c++;
        }
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)=='1')
             c1++;
        }
        return c+c1;
    }
}