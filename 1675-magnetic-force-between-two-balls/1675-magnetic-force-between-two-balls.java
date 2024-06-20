class Solution {
    public static boolean check(int[] ar,int m,int diff)
    {
        int c=1;
        int p=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(diff<=(ar[i]-p))
            {
                c++;
                p=ar[i];
            }
        }
        return c>=m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1;
        int high=position[n-1]-position[0];
        int ans=1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(check(position,m,mid))
            {
                ans=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return ans;
    }
}