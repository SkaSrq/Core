package com.company.srq;

public class WordSearch2 {
    public static void main(String... srgs)
    {
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};
        String word = "ABFEDSA";
        WordSearch2 obj = new WordSearch2();
        System.out.println("OUTPUT "+obj.exist(board,word));
    }

    public boolean exist(char[][] board, String word)
    {
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++)
            {
                if(wordsearch(board,word,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean wordsearch(char[][] board, String word, int i, int j, int k)
    {
        if(board[i][j]!=word.charAt(k))
        {
            return false;
        }
        if(k>=word.length()-1)
        {
            return true;
        }
        int[] dx = {1,-1,0,0,-1,-1,1,1};
        int[] dy = {0,0,-1,1,-1,1,-1,1};

        char s = board[i][j];
        board[i][j] = '$';
        for(int l=0; l<8;l++)
        {
            int x = i+ dx[l];
            int y = j+ dy[l];
            if(x>=0 && x< board.length && y>=0 && y< board[0].length && board[x][y]==word.charAt(k+1) )
            {
                if(wordsearch(board,word,x,y,k+1))
                {
                    return true;
                }
            }
        }
        board[i][j] = s;
        return false;
    }
}
