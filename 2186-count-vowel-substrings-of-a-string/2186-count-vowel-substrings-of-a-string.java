class Solution {
    public int countVowelSubstrings(String word) {
        HashSet<Character>hs=new HashSet<>();
        int ans=0;
        for(int i=0;i<word.length();i++)
        {   
            hs.clear();
            for(int j=i;j<word.length();j++)
            {
                char ch=word.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    hs.add(ch);
                    if(hs.size()==5)
                     ans++;
                }
                else
                break;
            }

        }
        return ans;
    }
}