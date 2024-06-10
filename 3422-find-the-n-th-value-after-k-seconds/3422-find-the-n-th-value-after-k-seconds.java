class Solution {
    private final int MOD=1000000007;
    public int valueAfterKSeconds(int n, int k) {
        if(n==0)
            return 0;
        if(k==0)
            return 1;
            
        int ar[]=new int[n];
        Arrays.fill(ar,1);
        int csum[]=new int[n];
        for(int i=1;i<=k;i++)
        {
            csum[0]=ar[0];
            for(int j=1;j<n;j++)
            {
                csum[j]=(csum[j-1]+ar[j])%MOD;
            }
            
            for(int u=0;u<n;u++)
                ar[u]=csum[u];
            
        }
        return ar[n-1];
        }
}