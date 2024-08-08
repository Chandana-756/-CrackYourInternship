class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }
    private String getActual(String str){
        StringBuilder actualString = new StringBuilder();
        int hashCount = 0;

        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == '#'){
                hashCount++;
                continue;
            }
            if(hashCount > 0){
                hashCount--;
            }
            else{
                actualString.insert(0,str.charAt(i));
            }
        }
        return actualString.toString();
    }
}

Time Complexity: O(n)
Space Complexity: O(n)
