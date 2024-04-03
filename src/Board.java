public class Board {

        public static final int SIZE = 4;
        public static final char EMPTY = '.';
//boardd
        private char[][] quartoBoard;
        public Board() {
            quartoBoard = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    quartoBoard[i][j] = EMPTY;
                }
            }
        }
        public Board(char[][] quartoBoard){
            this.quartoBoard=new char[SIZE][SIZE];
            for(int i=0;i<SIZE;i++){
                for(int j=0;j<SIZE;j++){
                    this.quartoBoard[i][j]=quartoBoard[i][j];
                }
            }
        }

        public Board(Board that) {
            this(that.quartoBoard);
            this.quartoBoard = new char[that.quartoBoard.length][that.quartoBoard[0].length];
            for(int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    this.quartoBoard[i][j] = that.quartoBoard[i][j];
                }
            }
        }

}


