class Solution {
    public int minimumLength(String s) {
        if(s.length()<3)
          return s.length();
           int n = s.length();
        int[] c = new int[26];
        
        for (char ch : s.toCharArray()) {
            c[ch - 'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (c[i] < 3) {
                continue;
            }
            if (c[i] % 2 != 0) {
                cnt += c[i] - 1;
            } else {
                cnt += c[i] - 2;
            }
        }
        
      return n - cnt;     

    }
}