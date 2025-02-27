class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>al=new ArrayList<>();
        int num=1,index=0;;
        while(num<=n&&index<target.length)
        {
             if(num==target[index])
             {
                al.add("Push");
                index++;
             }
             else
             {
                al.add("Push");
                al.add("Pop");
             }
             num++;
        }
        return al;
    }
}