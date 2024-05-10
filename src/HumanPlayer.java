import java.util.List;
import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer() {
        this.scanner = new Scanner(System.in);
    }

    public Piece selectPiece(List<Piece> availablePieces) throws GameException {
        System.out.println("Available pieces:");

        int choice;
        for(choice = 0; choice < availablePieces.size(); ++choice) {
            Piece piece = (Piece)availablePieces.get(choice);
            System.out.printf("%d: %s\n", choice + 1, this.formatPieceAttributes(piece));
        }



        while(true) {
            System.out.print("Select a piece to give to the other player (enter number): ");
            choice = this.scanner.nextInt();
            if (choice > 0 && choice <= availablePieces.size()) {
                return (Piece)availablePieces.remove(choice - 1);
            }

            System.out.println("Invalid choice, please try again.");
        }
    }

    public void placePiece(Board board, Piece piece) throws GameException, InvalidMoveException {
        boolean validPlacement = false;

        while(true) {
            while(!validPlacement) {
                System.out.print("Enter the row and column numbers to place the piece (0-3 for both): ");
                int row = this.scanner.nextInt();
                int col = this.scanner.nextInt();
                if (row >= 0 && row <= 3 && col >= 0 && col <= 3) {
                    if (board.isEmpty(row, col)) {
                        board.placePiece(piece, row, col);
                        validPlacement = true;
                    } else {
                        System.out.println("Position already occupied, please try again.");
                    }
                } else {
                    System.out.println("Invalid position, please try again.");
                }
            }

            return;
        }
    }

    private String formatPieceAttributes(Piece piece) {
        return String.format("Tall: %s, Square: %s, Dark: %s, Solid: %s", piece.isTall() ? "Yes" : "No", piece.isSquare() ? "Yes" : "No", piece.isDark() ? "Yes" : "No", piece.isSolid() ? "Yes" : "No");
    }
}