public class Board {

        public static final int SIZE = 4;
        public static final char EMPTY = '.';

        private char[][] quartoBoard;
        public Board() {
            quartoBoard = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    quartoBoard[i][j] = EMPTY;
                }
            }
        }

}


