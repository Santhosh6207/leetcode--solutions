class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        findcombination(0,candidates,target,ans,new ArrayList<>());
        return ans;  
    }
    static void findcombination(int id,int[] ar,int target,List<List<Integer>>ans,List<Integer>ds)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=id;i<ar.length;i++)
        {
            if(i>id&&ar[i]==ar[i-1])
              continue;
              if(ar[i]>target)
                break;
               ds.add(ar[i]);
               findcombination(i+1,ar,target-ar[i],ans,ds);
               ds.remove(ds.size()-1);

        }
    }
}