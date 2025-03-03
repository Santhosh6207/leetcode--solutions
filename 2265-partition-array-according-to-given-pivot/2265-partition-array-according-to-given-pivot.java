class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
             al.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot)
             al.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>pivot)
             al.add(nums[i]);
        }
     for(int i=0;i<al.size();i++)
     {
        nums[i]=al.get(i);
     }
     return nums;
    }
}