package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i=0 ; i<9;i++){
            int full=0;
            Set<Character> rows = new HashSet<>();
            for(int j=0; j<9;j++){
                if(board[i][j]!='.'){
                    full++;
                    rows.add(board[i][j]);
                }
            }
//            System.out.println(rows.size());
//            System.out.println(full);
            if(full!=rows.size()) return false;
        }

        for (int i=0 ; i<9; i++){
            int full=0;
            Set<Character> rows = new HashSet<>();
            for(int j=0; j<9;j++){
                if(board[j][i]!='.'){
                    full++;
                    rows.add(board[j][i]);
                }
            }
//            System.out.println(rows.size());
//            System.out.println(full);
            if(full!=rows.size()) return false;
        }
        int l=0;
        while(l<9) {
            int k = 0;
            while (k < 9) {
                int full = 0;
                Set<Character> rows = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[k + i][l + j] != '.') {
                            full++;
                            rows.add(board[k + i][l + j]);
                        }
                    }
                }
//                System.out.println(rows.size());
//                System.out.println(full);
//                System.out.println(rows);
                if (full != rows.size()) return false;
                k = k + 3;
            }
            l = l + 3;
        }

        return true;
    }

    public static void main(String[] args){
        char[][] board= new char[][]{{'5','3','.','.','7','.','.','.','.'}
                                    ,{'6','.','.','1','9','5','.','.','.'}
                                    ,{'.','9','8','.','.','.','.','6','.'}
                                    ,{'8','.','.','.','6','.','.','.','3'}
                                    ,{'4','.','.','8','.','6','.','.','1'}
                                    ,{'7','.','.','.','2','.','.','.','6'}
                                    ,{'.','6','.','.','.','.','2','8','.'}
                                    ,{'.','.','.','4','1','9','.','.','5'}
                                    ,{'.','.','.','.','8','.','.','7','9'}};
       System.out.println(isValidSudoku(board));
    }
}
