public class Board {

    private static final String[] BOARD_ROW = {"A", "B", "C", "D"};
    private static final String[] BOARD_COL = {"1", "2", "3", "4"};
    public static final int SIZE = 4;
    public static final char EMPTY = '.';
    private int row;
    private int col;

    private char[][] grid;

    public Board() {
        grid = new char[SIZE][SIZE];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                grid[row][col] = EMPTY;
            }
        }
    }

    public void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }


   /* public Board(Board other) {
        this.setRow(other.row);
        this.setCol(other.col);
    }*/

    private Board(int rank, int file) {
        this.setRow(rank);
        this.setCol(file);
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public void setRow(int row) {
        if (row >= 0 && row < SIZE)
            this.row = row;
    }

    public void setCol(int col) {
        if (col >= 0 && col < SIZE)
            this.col = col;
    }

    public String toString() {
        return " " + (SIZE + this.col) + (SIZE - this.row);
    }

    public static Board checkColRow(int col, int row) {
        if ((col < 0 || col > 7) || (row < 0 || row > 7)) {
            return null;
        }

        return new Board(col, row);
    }

    public static Board checkColRowString(String position) {
        if (position.length() != 2) {
            return null;
        }
        int row = 0;
        int col = 0;

        String colString = position.substring(0, 1);
        String rowString = position.substring(1, 2);

        for (int i = 0; i <= 7; i++) {
            if (colString.equals(BOARD_COL[i])) {
                col = i;
            }
            if (rowString.equals(BOARD_ROW[i])) {
                row = i;
            }
        }

        return checkColRow(col, row);
    }

    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }

    public void placePiece(int row, int col, char piece) throws IllegalArgumentException {

        if (grid[row][col] != EMPTY) {
            throw new IllegalArgumentException("Position already occupied: (" + row + ", " + col + ")");
        }

        grid[row][col] = piece;
    }

}

