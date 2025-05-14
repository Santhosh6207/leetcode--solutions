class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int zerocount=0;
        int zerocount1=0;
        long sumA=0;
        long sumB=0;
        for(int num:nums1)
        {
            if(num==0)
            zerocount++;
            sumA+=num;
        }
         for(int num:nums2)
        {
            if(num==0)
            zerocount1++;
            sumB+=num;
        }
        long minsumA=sumA+zerocount;
        long minsumB=sumB+zerocount1;
        if(zerocount==0&&zerocount1==0)
        return sumA==sumB?sumA:-1;
        else if(zerocount==0)
        return sumB+zerocount1<=sumA?sumA:-1;
        else if(zerocount1==0)
        return sumA+zerocount<=sumB?sumB:-1;
        return Math.max(minsumA,minsumB);


    }
}