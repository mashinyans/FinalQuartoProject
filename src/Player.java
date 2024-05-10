import java.util.List;
import java.util.Scanner;

public abstract class Player {
    protected String name;

    public Player() {
        this.askForName();
    }

    private void askForName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player's name: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return this.name;
    }

    abstract Piece selectPiece(List<Piece> var1) throws GameException;

    abstract void placePiece(Board var1, Piece var2) throws GameException, InvalidMoveException;
}