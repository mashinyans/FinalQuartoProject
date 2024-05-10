public class Board {
    private Piece[][] board = new Piece[4][4];

    public Board() {
    }

    public void placePiece(Piece piece, int row, int col) throws InvalidMoveException {
        if (this.board[row][col] != null) {
            throw new InvalidMoveException("Position already occupied.");
        } else {
            this.board[row][col] = piece;
        }
    }

    public boolean isEmpty(int row, int col) {
        return this.board[row][col] == null;
    }

    public void displayBoard() {
        System.out.println("Current board:");
        Piece[][] var1 = this.board;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Piece[] row = var1[var3];
            Piece[] var5 = row;
            int var6 = row.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                Piece piece = var5[var7];
                System.out.print(piece != null ? this.formatPiece(piece) + " " : "- ");
            }

            System.out.println();
        }

    }

    private String formatPiece(Piece piece) {
        return String.format("%s%s%s%s", piece.isTall() ? "T" : "S", piece.isSquare() ? "Q" : "C", piece.isDark() ? "D" : "L", piece.isSolid() ? "S" : "H");
    }

    public boolean checkWin() {
        return this.checkRowsAndColumns() || this.checkDiagonals() || this.checkSquares();
    }

    private boolean checkRowsAndColumns() {
        for(int i = 0; i < 4; ++i) {
            if (this.checkLine(this.board[i][0], this.board[i][1], this.board[i][2], this.board[i][3]) || this.checkLine(this.board[0][i], this.board[1][i], this.board[2][i], this.board[3][i])) {
                return true;
            }
        }

        return false;
    }

    private boolean checkDiagonals() {
        return this.checkLine(this.board[0][0], this.board[1][1], this.board[2][2], this.board[3][3]) || this.checkLine(this.board[0][3], this.board[1][2], this.board[2][1], this.board[3][0]);
    }

    private boolean checkSquares() {
        for(int row = 0; row < 3; ++row) {
            for(int col = 0; col < 3; ++col) {
                if (this.checkLine(this.board[row][col], this.board[row][col + 1], this.board[row + 1][col], this.board[row + 1][col + 1])) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean checkLine(Piece... pieces) {
        if (pieces[0] == null) {
            return false;
        } else {
            boolean sameTall = true;
            boolean sameSquare = true;
            boolean sameDark = true;
            boolean sameSolid = true;
            Piece[] var6 = pieces;
            int var7 = pieces.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                Piece p = var6[var8];
                if (p == null || p.isTall() != pieces[0].isTall()) {
                    sameTall = false;
                }

                if (p == null || p.isSquare() != pieces[0].isSquare()) {
                    sameSquare = false;
                }

                if (p == null || p.isDark() != pieces[0].isDark()) {
                    sameDark = false;
                }

                if (p == null || p.isSolid() != pieces[0].isSolid()) {
                    sameSolid = false;
                }
            }

            return sameTall || sameSquare || sameDark || sameSolid;
        }
    }
}


