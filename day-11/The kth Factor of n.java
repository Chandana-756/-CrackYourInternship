class Solution {
    public int kthFactor(int n, int k) {
        //List<Integer> factors = new ArrayList<>();
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
            if(cnt == k){
                return i;
            }
        }
        return -1;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
