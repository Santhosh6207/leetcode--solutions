class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isSuffixandPrefix(words[i],words[j]))
                  c++;
            }
        }
        return c;
        
    }
    public boolean isSuffixandPrefix(String str,String str1)
    {
         if (str1.startsWith(str) && str1.endsWith(str)) {
            return true;
        }
        return false;
    }
}