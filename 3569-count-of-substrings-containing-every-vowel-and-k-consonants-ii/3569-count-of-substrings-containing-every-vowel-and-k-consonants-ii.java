class Solution {
    public long countOfSubstrings(String word, int k) {
        if(word.length()<5+k)
          return 0;
          return solve(word,k)-solve(word,k+1);


    }
    public long solve(String word,int k)
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        long ans=0;
        int consonents=0,left=0;
        for(int r=0;r<word.length();r++)
        {
            char ch=word.charAt(r);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            else
            consonents++;
            while(hm.size()==5&&consonents>=k)
            {
                ans+=word.length()-r;
                char lch=word.charAt(left++);
                if(lch=='a'||lch=='e'||lch=='i'||lch=='o'||lch=='u')
            {
                hm.put(lch,hm.get(lch)-1);
                if(hm.get(lch)==0)
                 hm.remove(lch);
            }
            else
              consonents--;
            }
        }
        return ans;

    }
}