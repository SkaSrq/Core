package com.company.srq;

public class WordSearch {
    public static void main(String[] args)
    {
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};
        String word = "ABCCED";
        WordSearch obj = new WordSearch();
        System.out.print("OUTPUT : " +obj.exist(board,word));
    }
        public  boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            for(int i=0; i<m; i++)
            {
                for(int j=0; j<n;j++)
                {
                    if(wordSearch(board,word,i,j,0))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public  boolean wordSearch(char[][] board, String word, int i, int j, int k)
        {
            if(board[i][j]!=word.charAt(k))
            {
                return false;
            }
            if(k>=word.length()-1)
            {
                return true;
            }
            int[] myi = {-1, 0,1, 0};
            int[] myj = { 0,1,0,-1};

            char s = board[i][j];
            board[i][j] = '$';

            for(int l =0; l<4; l++)
            {
                int x = i + myi[l];
                int y = j + myj[l];
                if(x>=0 && x<board.length && y>=0 && y<board[0].length && board[x][y]==word.charAt(k+1))
                {
                    if(wordSearch(board,word,x,y,k+1))
                    {
                        return true;
                    }
                }

            }
            board[i][j] = s;
            return false;

        }

}
