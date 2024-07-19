class Solution {
    public String reverseWords(String s) {
         StringBuilder ans = new StringBuilder();
        StringBuilder str = new StringBuilder();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                ans.append(str.reverse());
                ans.append(' ');
                str.setLength(0); // clear the StringBuilder
            } else {
                str.append(s.charAt(i));
            }
        }
        
        // Append the last word after reversing
        ans.append(str.reverse());
        
        return ans.toString();
    }
   
}