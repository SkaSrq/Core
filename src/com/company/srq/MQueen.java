package com.company.srq;

public class MQueen {
    static final int N = 4;
    public  static void main(String... args)
    {
        int[][] board = new int[N][N];

    }
    public boolean exist(int[][] board)
    {
        boolean visited[][] = new boolean[N][N];
        if(!chek(board,0,0))
        {
            System.out.println("Solution does not exist");
            return false;
        }
        printSolution(board);
        return true;
    }
    public boolean chek(int[][] board, int i, int j)
    {
        return false;
    }

    public void printSolution(int[][] board)
    {
        for(int i=0; i< board.length;i++)
        {
            for(int j =0; j<board[0].length ;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    boolean isSafe(int[][] board, int x, int y) {
        return true;
    }
}
