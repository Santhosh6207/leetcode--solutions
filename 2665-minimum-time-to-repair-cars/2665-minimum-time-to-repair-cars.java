class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l=1,r=(long)1e14;
        while(l<r)
        {
            long mid=(l+r)/2;
            if(time(ranks,cars,mid))
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }

        }
        return l;
    }
    public boolean time(int[] ranks,int cars,long mid)
    {
        long car=0;
        for(int r:ranks)
        {
            long c=mid/r;
            long c1=(long)Math.sqrt(c);
            car+=c1;
        }
          return car>=cars;
    }
}