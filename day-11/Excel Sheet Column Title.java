class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while(columnNumber > 0){
            int offset = (columnNumber - 1) % 26;
            res.append((char)('A' + offset));
            columnNumber = (columnNumber - 1) / 26;
        }
        return res.reverse().toString();
    }
}

Time Complexity: O(log n)
Space Complexity: O(1)
