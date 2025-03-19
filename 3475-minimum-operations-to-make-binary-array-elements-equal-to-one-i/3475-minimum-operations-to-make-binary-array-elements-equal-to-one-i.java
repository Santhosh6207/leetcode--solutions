class Solution {
    public  void flip(int nums[],int i)
    {
         for (int j = i ;j < i + 3; j++) {
            nums[j] = nums[j] == 0 ? 1 : 0;
        }
    }
    public int minOperations(int[] nums) {
        int c=0;
        int fc=0;
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]==0)
            {
                flip(nums,i);
                    fc++;
            }
        }
        for (int i = nums.length - 2; i < nums.length; i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }

        return fc;
    }
}