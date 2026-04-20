import java.util.*;

class meargeInterval56 {

    public static int[][] merge(int[][] intervals) {
        // Step 1: Sort using Arrays.sort (simpler than manual insertion sort)
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            if (current[1] >= intervals[i][0]) {
                // Merge
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap → store current
                result.add(current);
                current = intervals[i];
            }
        }

        // Add last interval
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{0,2},{3,5}};
        int[][] arr = merge(intervals);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}