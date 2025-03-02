class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        //HashMap<Integer,Integer>hm1=new HashMap<>();
        for(int i=0;i<n1;i++)
        {
            hm.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<n2;i++)
        {
           hm.put(nums2[i][0], hm.getOrDefault(nums2[i][0], 0) + nums2[i][1]);

        }
        int[][] result = new int[hm.size()][2];
        int index = 0;
        List<Integer> keys = new ArrayList<>(hm.keySet());
        Collections.sort(keys); 

        for (int key : keys) {
            result[index++] = new int[]{key, hm.get(key)};
        }

        return result;
        
    }
}