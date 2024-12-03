
class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : amount) {
            if (num > 0) {
                pq.offer(num);
            }
        }

        int t = 0;
        while (!pq.isEmpty()) {
            int first = pq.poll(); 
            int second = !pq.isEmpty() ? pq.poll() : 0;
            first--;
            second--;
            if (first > 0) {
                pq.offer(first);
            }
            if (second > 0) {
                pq.offer(second);
            }
            t++;
        }

        return t;
    }
}
