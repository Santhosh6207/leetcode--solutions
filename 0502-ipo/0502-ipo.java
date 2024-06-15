class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
    int[][] project =new int[n][2];
        for (int i = 0; i < n; i++) {
            project[i][0] =capital[i];
            project[i][1] =profits[i];

        }        
        Arrays.sort(project, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> mHeap = new PriorityQueue<>((a, b) ->Integer.compare(b, a));        
        int currentCapital = w;
        int projectsIndex = 0;
        for (int i = 0; i < k; i++) {

            while (projectsIndex < n && project[projectsIndex][0] <= currentCapital) {
                mHeap.add(project[projectsIndex][1]);
                projectsIndex++;
        }
            if (mHeap.isEmpty()) {
                break;
            }
            currentCapital += mHeap.poll();

        }
        return currentCapital;
        
    }
}