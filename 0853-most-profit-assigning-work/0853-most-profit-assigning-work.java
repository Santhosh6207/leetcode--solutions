class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=profit.length;
        int m=worker.length;
        ArraySort(difficulty,profit,n);
        for(int i=1;i<n;i++)
        {
            profit[i]=Math.max(profit[i],profit[i-1]);
        }
        int res=0;
        for(int i=0;i<m;i++)
        {
           int idx=bs(difficulty,worker[i],n);
           if(idx==-1)
             continue;
             res+=profit[idx];
     
    }
     return res;  
    }
    public static void ArraySort(int[] diff,int[] prof,int n)
    {
        int com[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            com[i][0]=diff[i];
            com[i][1]=prof[i];
        }
        Arrays.sort(com,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++)
        {
            diff[i]=com[i][0];
            prof[i]=com[i][1];
        }
    }
        public static int bs(int[] diff,int key,int n)
        {
            int low=0;
            int high=n-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(diff[mid]<=key)
                    low=mid+1;
                    else
                    high=mid-1;
            }
            return high;
        }
    }
