import java.util.Scanner;

public class HumanPlayer extends Player{
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    // Method for human player to make a move
    @Override
    public int[] makeMove() {
        System.out.println("Enter row and column to place the piece (e.g., 1 2):");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return new int[]{row, col};
    }
}

