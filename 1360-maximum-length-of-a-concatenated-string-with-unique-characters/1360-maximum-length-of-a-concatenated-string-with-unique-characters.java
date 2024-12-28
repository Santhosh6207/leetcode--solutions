class Solution {
    public boolean hasDuplicates(String s1,String s2)
    {
        char ch[]=new char[26];
        for(int i=0;i<26;i++)
        {
            ch[i]=0;
        }
        for(char c:s2.toCharArray())
        {
            if(ch[c-'a']>0)
              return true;
              ch[c-'a']++;
        }
        for(char c:s1.toCharArray())
        {
            if(ch[c-'a']>0)
              return true;
              ch[c-'a']++;
        }
        return false;
    }
    public int maxLength(List<String> arr) {
        int n=arr.size();
        String temp="";
        int res=solve(arr,n,0,temp);
        return res;
        
    }
    public int solve(List<String>arr,int n,int idx,String temp)
    {
        if(idx==n)
          return temp.length();
        int include=0;
        int exclude=0;
        if(hasDuplicates(arr.get(idx),temp))
        {
            exclude=solve(arr,n,idx+1,temp);
        }
        else{
            exclude=solve(arr,n,idx+1,temp);
            include=solve(arr,n,idx+1,temp+arr.get(idx));
        }
        return Math.max(include,exclude);
    }
    
}