class Solution {
    public String largestNumber(int[] nums) {
        String st[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            st[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(st,new Comparator<String>()
        {
            public int compare(String s,String s1)
            {
               return (s1+s).compareTo(s+s1);
            }
        });
         if (st[0].equals("0")) {
            return "0";
        }
         StringBuilder sb = new StringBuilder();
        for (String num : st) {
            sb.append(num);
        }

        return sb.toString();
      
    }
}