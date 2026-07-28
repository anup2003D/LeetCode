class Solution {
    public void explore(char[][] grid, int i, int j){
        int row = grid.length;
        int column = grid[0].length;

        if(i<0 || i>=row || j<0 || j>=column){
            return;
        }
        
        if (grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

                   //up
            explore(grid, i-1, j);
        
                    //down
            explore(grid, i+1, j);
        
                   //left
            explore(grid, i, j-1);
        
                   //right
            explore(grid, i, j+1);
        
    }
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count=0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                if(grid[i][j]=='1'){
                    count++;
                    explore(grid, i, j);
                }
                
            }
        }
        return count;
    }
}