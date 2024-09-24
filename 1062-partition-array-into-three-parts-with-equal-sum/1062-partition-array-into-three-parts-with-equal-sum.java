class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int nums:arr)
        sum+=nums;
        if(sum%3!=0)
          return false;
          int part=sum/3;
          int temp=0;
          int count=0;
          for(int a:arr)
          {
             temp+=a;
             if(temp==part)
             {
                temp=0;
                count++;
             }
          }
        return count>=3;
    }
}