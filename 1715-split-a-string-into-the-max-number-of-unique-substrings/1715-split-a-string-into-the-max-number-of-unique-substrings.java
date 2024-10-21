
class Solution {
    HashSet<String> al = new HashSet<>(); // Changed to store unique substrings

    public int maxUniqueSplit(String s) {
        return solve(0, s);
    }

    public int solve(int idx, String s) {
        if (idx == s.length()) {
            return 0;
        }

        int ans = 0;
        for (int i = idx; i < s.length(); i++) {
            String str = s.substring(idx, i + 1);

            if (!al.contains(str)) {
                al.add(str); 
                ans = Math.max(ans, 1 + solve(i + 1, s)); 
                al.remove(str); 
            }
        }
        return ans;
    }
}
