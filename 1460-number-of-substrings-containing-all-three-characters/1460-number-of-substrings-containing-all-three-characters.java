class Solution {
    public int numberOfSubstrings(String s) {
       HashMap<Character,Integer>hm=new HashMap<>();
        int count=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while (hm.getOrDefault('a', 0) > 0 && 
                   hm.getOrDefault('b', 0) > 0 && 
                   hm.getOrDefault('c', 0) > 0) {
                count += s.length() - right;
                char lch = s.charAt(left);
                hm.put(lch, hm.get(lch) - 1);
                if (hm.get(lch) == 0) {
                    hm.remove(lch);  
                }
                left++;
            }

        }
        return count;
    }
}