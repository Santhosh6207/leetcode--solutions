class Solution {
    HashSet<ArrayList<Integer>>hs=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>al=new ArrayList<>();
       Arrays.sort(nums);
       find(0,nums,al,new ArrayList<>());
       al.addAll(hs);
       return al; 
    }
    public void find(int idx,int nums[],List<List<Integer>>al,List<Integer>ds)
    {
        if(idx==nums.length)
        {
          hs.add(new ArrayList<>(ds));
          return;
        }
         find(idx+1,nums,al,ds);
         ds.add(nums[idx]);
         find(idx+1,nums,al,ds);
         ds.remove(ds.size()-1);
          

    }
}