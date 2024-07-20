class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;
    }
    public void solve(String curr,int open,int closed,int total,List<String> ans){
        if(curr.length() == 2*total){
            ans.add(curr);
            return;
        }
        if(open < total){
            solve(curr+"(",open+1,closed,total,ans);
        }
        if(closed < open){
            solve(curr+")",open,closed+1,total,ans);
        }
    }
}

Time Complexity: O(4 ^n / n ^(3/2))
Space Complexity: O(4 ^ n / n ^ (1/2))
