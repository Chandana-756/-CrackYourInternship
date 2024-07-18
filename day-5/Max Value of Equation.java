class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            while (!pq.isEmpty() && points[i][0] - pq.peek().getValue() > k) {
                pq.poll(); 
            }
            if (!pq.isEmpty()) {
                ans = Math.max(ans, points[i][0] + points[i][1] + pq.peek().getKey());
            }
            pq.add(new Pair<>(points[i][1] - points[i][0], points[i][0]));
        }

        return ans;
    }
}

Time Complexity: O(nlogn)
Space Complexity: O(n)
