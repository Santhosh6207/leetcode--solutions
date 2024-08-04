class Solution {
    static final int mod=1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer>al=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {     
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum=(sum+nums[j])%mod;
                al.add(sum);
            }
        }
        int sum1=0;
        Collections.sort(al);
        
        for(int i=left-1;i<right;i++)
          sum1=(sum1+al.get(i))%mod;
       return sum1; 
    }
}