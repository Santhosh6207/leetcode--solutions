class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>al=new ArrayList<>();
        find(1,n,k,al,new ArrayList<>());
        return al;
    }
    public void find(int idx,int target,int n,List<List<Integer>>al,List<Integer>ds)
    {   
        if(target==0&&ds.size()==n)
        {
           al.add(new ArrayList<>(ds));
            return ;
        }
        if(ds.size()>n)
          return;
        for(int i=idx;i<=9;i++)
        {
           if(i>target)
            break;
            ds.add(i);
            find(i+1,target-i,n,al,ds);
            ds.remove(ds.size()-1);
        }
    }
}