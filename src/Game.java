import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board = new Board();
    private Player[] players = new Player[2];
    private List<Piece> availablePieces;
    private int currentPlayerIndex = 0;  // Track who is the current player

    public Game(Player player1, Player player2) {
        players[0] = player1;
        players[1] = player2;
        initializePieces();
    }

    private void initializePieces() {
        availablePieces = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            availablePieces.add(new Piece(
                    (i & 8) != 0, (i & 4) != 0, (i & 2) != 0, (i & 1) != 0
            ));
        }
    }

    public void start() throws GameException, InvalidMoveException {
        while (!board.checkWin() && !availablePieces.isEmpty()) {
            Player selectingPlayer = players[currentPlayerIndex];
            Player placingPlayer = players[(currentPlayerIndex + 1) % 2];

            System.out.println(selectingPlayer.getName() + " selects a piece for " + placingPlayer.getName() + " to place.");
            Piece selectedPiece = selectingPlayer.selectPiece(availablePieces);
            placingPlayer.placePiece(board, selectedPiece);
            board.displayBoard();

            // Check for a win after placing the piece
            if (board.checkWin()) {
                System.out.println("Game Over! " + placingPlayer.getName() + " wins by placing the piece selected by " + selectingPlayer.getName() + ".");
                return;
            }

            // Swap players
            currentPlayerIndex = (currentPlayerIndex + 1) % 2;
        }
        if (availablePieces.isEmpty()) {
            System.out.println("The game is a draw. No more pieces left to play.");
        }
    }
}
