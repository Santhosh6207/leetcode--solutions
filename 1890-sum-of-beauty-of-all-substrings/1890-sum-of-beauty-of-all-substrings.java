class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int freq[]=new int[26];
            for(int j=i;j<n;j++)
            {  
                freq[s.charAt(j)-'a']++;
                int min=getmin(freq);
                int max=getmax(freq);
                ans+=(max-min);
            }
        }
       return ans; 
        
    }
    public static int getmin(int freq[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            min=Math.min(min,freq[i]);
        }
        return min;
        
    }
     public static int getmax(int freq[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++)
        {    
            if(freq[i]!=0)
            max=Math.max(max,freq[i]);
        }
        return max;
    }
}