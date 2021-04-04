package com.company.srq;

public class RatMaze {
    static final int N =4;
     boolean isSafe(int x, int y, int[][] board)
    {
        return (x>=0 && y>=0 && x<N && y<N && board[x][y]==1);
    }
   void printSolution(boolean[][] solution)
    {
        for(int i=0; i<N;i++)
        {
            for(int j=0; j<N; j++)
            {
                System.out.print(solution[i][j]+" ");
            }
            System.out.println();
        }
    }
    boolean chekUtil(int x, int y, int[][] board, boolean[][] visited)
    {
        if(x == N-1 && y == N-1)
        {
            visited[x][y]= true;
            return true;
        }

        if(isSafe(x,y,board))
        {
            visited[x][y]= true;
            if(isSafe(x,y+1,board))
            {
                chekUtil(x,y+1,board,visited);
                return true;
            }
            if(isSafe(x+1,y,board))
            {
                chekUtil(x+1,y,board,visited);
                return true;
            }

            visited[x][y] = false;
            return false;
        }
        return false;
    }
     boolean check(int[][] board)
    {
        boolean visited[][] = new boolean[N][N];
        if(!chekUtil(0, 0, board, visited))
        {
            System.out.println("Solution does not exist");
            return false;
        }
//        printSolution(visited);
        return true;
    }

    static public void main(String[] aman) {
        RatMaze obj = new RatMaze();
        int[][] myBoard = {{1,0,0,0},
                           {1,1,1,0},
                           {1,0,1,0},
                           {1,1,1,1}};
        System.out.println(obj.check(myBoard));
    }
}
