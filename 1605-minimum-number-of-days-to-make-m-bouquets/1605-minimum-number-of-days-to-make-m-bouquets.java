class Solution {

    public static boolean possible(int ar[], int day, int m, int k) {
        int count = 0;
        int bouquets = 0;
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] <= day) {
                count++;
            } else {
                bouquets += (count / k);
                count = 0;
            }
        }
        bouquets += (count / k);
        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val=(long)m*k;
        if (val > n) {
            return -1;
        }

       int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low=0;
        int high=maxi;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k))
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
}