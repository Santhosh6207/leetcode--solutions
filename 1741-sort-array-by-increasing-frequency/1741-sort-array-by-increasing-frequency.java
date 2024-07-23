class Solution {
    public int[] frequencySort(int[] nums) {
       TreeMap<Integer,Integer>hm=new TreeMap<>();
       for(int i=0;i<nums.length;i++)
       {
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       } 
       List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

       Collections.sort(list, (a, b) -> {
            int freqA = hm.get(a);
            int freqB = hm.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB); 
            } else {
                return Integer.compare(b, a); 
            }
        });
        int[] result = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
       
    }
}