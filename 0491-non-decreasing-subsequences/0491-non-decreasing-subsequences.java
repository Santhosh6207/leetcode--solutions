class Solution {
    HashSet<List<Integer>>al=new HashSet<>();
    List<List<Integer>>bl=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
       // List<List<Integer>>al=new ArrayList<>();
        solve(0,nums,new ArrayList<>());
        return bl;
    }
    public void solve(int i,int ar[],List<Integer>ds)
    {
        if(i==ar.length)
        {
            if(ds.size()>1&&check(ds))
            {
               if (al.add(new ArrayList<>(ds))) {  
                    bl.add(new ArrayList<>(ds));   
                }
            }
            return ;
        }
        ds.add(ar[i]);
        solve(i+1,ar,ds);
        ds.remove(ds.size()-1);
        solve(i+1,ar,ds);
    }
    public boolean check(List<Integer>cl)
    {
        int n=cl.size();
        for(int i=0;i<n-1;i++)
        {
            if(cl.get(i)>cl.get(i+1))
              return false;
        }
        return true;
    }
}