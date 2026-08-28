class Solution {
    public void explore(char[][] grid, int i, int j){

        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return ;
        if(grid[i][j]=='0') return;

        grid[i][j]='0';

        explore(grid, i-1, j);
        explore(grid, i+1, j);
        explore(grid, i, j-1);
        explore(grid, i, j+1);
    }
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count=0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]=='1'){
                    count++;
                    explore(grid, i, j);
                }
            }
        }
        return count;
    }
}







