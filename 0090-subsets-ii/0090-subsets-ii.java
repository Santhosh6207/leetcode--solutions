import java.util.*;

class Solution {
    HashSet<List<Integer>> hs = new HashSet<>(); // HashSet to track unique subsets

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates easily
        find(0, nums, al, new ArrayList<>());
        return al;
    }

    public void find(int idx, int nums[], List<List<Integer>> al, List<Integer> ds) {
        // Add the current subset if it is unique (HashSet ensures uniqueness)
        if (hs.add(new ArrayList<>(ds))) {
            al.add(new ArrayList<>(ds));
        }

        // Iterate over remaining elements and recursively build subsets
        for (int i = idx; i < nums.length; i++) {
            ds.add(nums[i]); // Include current element
            find(i + 1, nums, al, ds); // Recurse to explore further subsets
            ds.remove(ds.size() - 1); // Backtrack by removing the current element
        }
    }
}
