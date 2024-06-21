class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int avgsum=0;
        for(int i=0;i<k;i++)
        {
            avgsum+=arr[i];
            
        }
        if((avgsum/k)>=threshold)
              c++;
        int left=0;
        int right=k;
        while(right<arr.length)
        {
            avgsum+=arr[right];
            avgsum-=arr[left];
            if((avgsum/k)>=threshold)
            c++;
            right++;
            left++;
        }
        return c;
        
    }
}