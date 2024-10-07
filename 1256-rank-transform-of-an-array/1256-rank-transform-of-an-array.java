class Solution {
    public int[] arrayRankTransform(int[] arr){
         int[] ar = arr.clone(); 
        Arrays.sort(ar); 
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : ar) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
        
    }
}