class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        Arrays.sort(nums);
        if(nums[nums.length-1]<0)
          return nums[nums.length-1];
        for(int num:nums)
        {
            hs.add(num);
        }
          int sum=0;
          for(Integer num:hs)
          {  
            if(num>0)
            sum+=num;
            
          }
          return sum;
    }
}