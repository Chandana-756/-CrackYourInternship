class Solution {
    private boolean knows(int mat[][], int a, int b){
        if(mat[a][b] == 1) return true;
        else return false;
    }
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int n = mat.length;
        //step-1: Push all elements in the stack
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        //step-2:
        while(st.size() != 1){
            int a = st.pop();
            int b = st.pop();
            if(knows(mat,a,b)){
                st.push(b);
            }
            else{
                st.push(a);
            }
        }
        int pot = st.peek();
        
        //step-3: Single element obtained is potential celebrity 
        //i.e whether that person is celebrity or not
        //to do this we need to verify 
        
        //rowCheck
        boolean rowCheck = false;
        int zeroCount = 0;
        for(int i=0;i<n;i++){
            if(mat[pot][i] == 0) zeroCount++;
        }
        
        if(zeroCount == n){
            rowCheck = true;
        }
        
        //column check
        boolean colCheck = false;
        int oneCount = 0;
        for(int i=0;i<n;i++){
            if(mat[i][pot] == 1) oneCount++;
        }
        if(oneCount == n-1){
            colCheck = true;
        }
        //step-4:
        if(rowCheck && colCheck){
            return pot;
        }
        else return -1;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
