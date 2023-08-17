package bootcoding.leetcodeque.matrix;

public class IslandParimeter463 {
    int count =0;
    public int islandPar(int[][]grid){
        count =0;
        for(int i =0;i< grid.length;i++){
            for(int j =0;j<grid[i].length;j++){
                if(grid[i][j] ==1){
                nums(grid,i,j);
                break;
                }
            }
        }
        return  count;
    }
    private  void nums(int[][]grid, int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]==0){
            count++;
            return;
        }
        if(grid[i][j] ==-1)return;
        grid[i][j]=-1;
        nums(grid,i+1,j);
        nums(grid, i-1,j);
        nums(grid, i, j+1);
        nums(grid, i, j-1);
    }

    public static void main(String[] args) {
        IslandParimeter463 is =new IslandParimeter463();
        int [][] grid ={{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}

        };
        int perimeter =is.islandPar(grid);
        System.out.println(perimeter);
    }
}
