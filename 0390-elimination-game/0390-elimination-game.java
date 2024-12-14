class Solution {
    public int lastRemaining(int n) {
    
     int ans=solve(n); 
     return ans; 
    }
    public int solve(int n)
    {
        if(n==1)
         return 1;
         return 2*(n/2+1-solve(n/2));
    }
}