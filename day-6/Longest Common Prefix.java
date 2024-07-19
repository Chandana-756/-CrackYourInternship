class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray(); //first string
        char[] last = strs[strs.length-1].toCharArray(); //last string

        for(int i=0;i<first.length;i++){
            if(first[i] != last[i]) 
              break;
            res.append(first[i]);
        }
        return res.toString();
    }
}

Time Complexity: O(nlogn)
Space Complexity: O(1)
