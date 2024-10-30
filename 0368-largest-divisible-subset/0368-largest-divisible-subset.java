class Solution {
    List<Integer>result=new ArrayList<>();
    int dp[];
    public List<Integer> largestDivisibleSubset(int[] nums) {
       dp=new int[nums.length+1];
       Arrays.sort(nums);
       Arrays.fill(dp,-1);
       solve(0,1,nums,new ArrayList<>()); 
       return result;
    }
    public void solve(int idx,int idx1,int[] nums,List<Integer>al)
    {
       if(idx>=nums.length)
       {   
          if(al.size()>result.size())
          {
             result.clear();
             result.addAll(al);
          }
           return ;
       }
       if(dp[idx]<al.size()&&nums[idx]%idx1==0||idx1%nums[idx]==0)
       {   
           dp[idx]=al.size();
           al.add(nums[idx]);
           solve(idx+1,nums[idx],nums,al);
           al.remove(al.size()-1);
       }
       solve(idx+1,idx1,nums,al);
    }
}