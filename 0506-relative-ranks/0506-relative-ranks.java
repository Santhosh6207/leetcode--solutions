import java.util.PriorityQueue;
import java.util.AbstractMap.SimpleEntry;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        // PriorityQueue to store scores along with their indices in descending order
        PriorityQueue<SimpleEntry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        // Populate the priority queue with index and score pairs
        for (int i = 0; i < score.length; i++) {
            pq.offer(new SimpleEntry<>(i, score[i]));
        }

        String[] rank = new String[score.length];
        int i = 1;

        // Assign ranks based on the order in the priority queue
        while (!pq.isEmpty()) {
            SimpleEntry<Integer, Integer> entry = pq.poll();
            int index = entry.getKey();

            if (i == 1) {
                rank[index] = "Gold Medal";
            } else if (i == 2) {
                rank[index] = "Silver Medal";
            } else if (i == 3) {
                rank[index] = "Bronze Medal";
            } else {
                rank[index] = String.valueOf(i);
            }
            i++;
        }

        return rank;
    }
}
