public class Board {

    public static final int SIZE = 4;
    public static final char EMPTY = '.';
    //board
    private char[][] quartoBoard;

    public Board() {
        quartoBoard = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                quartoBoard[i][j] = EMPTY;
            }
        }
    }

    public Board(char[][] quartoBoard) {
        this.quartoBoard = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.quartoBoard[i][j] = quartoBoard[i][j];
            }
        }
    }

    private static char[][] copyArray(char[][] board) {
        char[][] board1 = new char[board.length][board[0].length];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board1[i][j] = board[i][j];
            }
        }

        return board1;
    }
    public char getPosition(int i, int j) {
        return quartoBoard[i][j];
    }

    public char[][] getBoard() {
        return copyArray(quartoBoard);
    }

    public void printTheBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++);
        }
        System.out.println();
    }
    public boolean submitMove(char player,int i,int j){
        if(i>=0&&i<SIZE&&j>=0&&j<SIZE&&quartoBoard[i][j]==EMPTY){
            quartoBoard[i][j]=player;
            return true;
        }
        return false;
    }
public boolean isBoardFull() {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            if (quartoBoard[i][j] == EMPTY) {
                return false;
            }
        }
    }
    return true;
}

}
