class Solution {
    public static boolean check(int[] ar)
    {
         for (int num : ar) {
            if (num != 0) {
                return false;
            }
        }
        return true;

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>al=new ArrayList<>();
        int n=s.length();
        int n1=p.length();
        int ar[]=new int[26];
         for(char ch:p.toCharArray())
             ar[ch-'a']++;
             int left=0;
             int right=0;
             while(right<n)
             {
                int idx=s.charAt(right)-'a';
                ar[idx]--;
                if((right-left+1)==n1)
                {
                    if(check(ar))
                    al.add(left);
                    ar[s.charAt(left)-'a']++;
                    left++;
                }
                right++;
             }
        
        return al;
        
        
        
        
        
        
        
    }
}