class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
         Long[] aLong = Arrays.stream(a).boxed().toArray(Long[]::new);
        
        Arrays.sort(aLong, Collections.reverseOrder());
        Arrays.sort(b);
    
        for (int i = 0; i < n; i++) {
            if (aLong[i] + b[i] < k) {
                return false;
            }
        }
        
        return true;
    }
}

Time Complexity: O(n logn)
Space Complexity: O(1)
