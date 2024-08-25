class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initalColor = image[sr][sc];
        int[][] ans = image;
        int delRow[] = {-1,0,1,0};
        int delCol[] = {0,1,0,-1};
        dfs(sr,sc,ans,image,color,delRow,delCol,initalColor);
        return ans;
    }
    public void dfs(int row, int col, int[][] ans, int[][] image, int newColor,int[] delRow, int[] delCol, int iniColor){
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        for(int i=0;i<4;i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == iniColor && ans[nrow][ncol] != newColor){
                dfs(nrow,ncol,ans,image,newColor,delRow,delCol,iniColor);
            }
        }
    }
}

Time Complexity: O(n x m)
Space Complexity: O(n x m)
