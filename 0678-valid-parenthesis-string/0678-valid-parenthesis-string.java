class Solution {
    Integer[][] dp;

    public boolean checkValidString(String s) {
        int n = s.length();
        dp = new Integer[n + 1][n + 1]; // Initialize DP array
        return solve(s, 0, 0);
    }

    public boolean solve(String s, int idx, int c) {
        int n = s.length();

        // Base cases
        if (c < 0) return false; // Invalid if more ')' than '('
        if (idx == n) return c == 0; // Valid if all parentheses are balanced

        // Check memoized result
        if (dp[idx][c] != null) return dp[idx][c] == 1;

        boolean result;
        char ch = s.charAt(idx);

        if (ch == '(') {
            result = solve(s, idx + 1, c + 1);
        } else if (ch == ')') {
            result = solve(s, idx + 1, c - 1);
        } else { // ch == '*'
            result = solve(s, idx + 1, c + 1) // Treat '*' as '('
                  || solve(s, idx + 1, c - 1) // Treat '*' as ')'
                  || solve(s, idx + 1, c);    // Treat '*' as empty
        }

        // Memoize the result
        dp[idx][c] = result ? 1 : 0;

        return result;
    }
}
