class Solution {
    public void sortColors(int[] nums) {
        
        //using priority queue and its properties..
        // Time Complexity of element addition in priority queue is : O(logn).
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<nums.length ; i++){
            pq.add(nums[i]);
        }
        
        for(int i=0 ; i<nums.length ; i++){
            nums[i] = pq.poll();
        }
        
        // Time Complexity : O(n*logn)
    }
}