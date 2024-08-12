class Solution {
    public String removeDuplicates(String s, int k) {
        int cnt = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                cnt++;
            }
            else{
                cnt = 1;
            }
            if(cnt == k){
                String reduced = s.substring(0,i-k+1) + s.substring(i+1);
                return removeDuplicates(reduced,k);
            }
        }
        return s;
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
