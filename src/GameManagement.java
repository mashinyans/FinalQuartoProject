public class GameManagement {
    private Board board;
    private Player[] player;
    private int currentPlayer;

    public GameManagement() {
        board = new Board();
        player = new Player[2];
        player[0] = new HumanPlayer("Human");
        player[1] = new AIPlayer("AI");
        currentPlayer = 0;
    }

    public void startGame() {
        while (true) {
            System.out.println("Current board: ");
            board.printBoard();

            selectedPiece = player[currentPlayer].selectPiece();

            switchPlayer();

            int[] move = player[currentPlayer].placePiece(selectedPiece);
            board.placePiece(move[0], move[1], selectedPiece);

            if (checkWin()) {
                System.out.println(player[currentPlayer].getName() + "wins!");
                break;
            }

            switchPlayer();
        }
    }

    private void switchPlayer() {
        currentPlayer = 1 - currentPlayer;
    }

    private boolean checkWin() {
        return false;
    }
}
