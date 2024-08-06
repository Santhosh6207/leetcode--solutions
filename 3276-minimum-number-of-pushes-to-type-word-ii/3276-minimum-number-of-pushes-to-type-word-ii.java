class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int c[]=new int[26];
        for(int i=0;i<n;i++)
        {
            c[word.charAt(i)-'a']++;
        }
        Arrays.sort(c);
        int ans=0;
        int push=1;
        int kc=0;
        for(int i=25;i>=0;i--)
        {
              ans+=(c[i]*push);
              kc++;
              if(kc%8==0)
              push++;
        }
        return ans;
    }
}