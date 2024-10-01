class Solution {
    public final long mod = 1000000007;
    public long modPow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) != 0) { 
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1; 
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long odd = n / 2;        
        long even = (n + 1) / 2;  
        long f = modPow(5, even, mod);
        long s = modPow(4, odd, mod);
        long ans = (f * s) % mod;
        
        return (int) ans;
    }
}
