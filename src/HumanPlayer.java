import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name) {
        super(name);
    }

    public Piece selectPiece() {
        System.out.println("Select a piece to give to the opponent (format: THSB for Tall, Hollow, Square, Black):");
        String pieceAttributes = scanner.nextLine();
        return new Piece(pieceAttributes);
    }

    @Override
    public int[] placePiece(Piece piece) {
        System.out.println("Enter row and column to place the piece (e.g., 1 2):");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return new int[]{row, col};
    }


}

