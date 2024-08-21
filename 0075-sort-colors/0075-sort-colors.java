class Solution {
    public void sortColors(int[] nums) {
      int cr[]=new int[3];
      for(int i=0;i<nums.length;i++)
      {
        cr[nums[i]]++;
      } 
      int temp=0;
      for(int i=0;i<3;i++)
      {  
        
        int j=0;
        while(j<cr[i])
        {
            nums[temp++]=i;
            j++;
        }
       
      }
    }
}