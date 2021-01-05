import java.util.Arrays;
import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        boolean val = isValidSudoku(board);

        int[] i = {4,5,6,7,0,1,2};

        System.out.println(Arrays.binarySearch(i,0));

        System.out.println(val);
    }

    public static boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0; j<9;j++){
                char current_val = board[i][j];
                if(current_val != '.'){
                   if( !seen.add(current_val + " found in row" + i) ||
                           !seen.add(current_val + " found in column " + j) ||
                           !seen.add(current_val + " found in sub-box " + i/3 +" - " + j/3))
                       return false;
                }
            }
        }

        return true;
    }
}
