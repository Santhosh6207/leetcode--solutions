class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int new1[]=new int[nums1.length];
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
            hm.put(nums1[i],i);
          for(int i=nums2.length-1;i>=0;i--)
          {
            while(!st.isEmpty()&&nums2[i]>st.peek())
            {
                st.pop();
            }
            if(hm.containsKey(nums2[i]))
            {
                if(st.isEmpty())
                {
                   new1[hm.get(nums2[i])]=-1;
                }
                else
                new1[hm.get(nums2[i])]=st.peek();
            }
            st.push(nums2[i]);
          }  
          return new1;
    }
}