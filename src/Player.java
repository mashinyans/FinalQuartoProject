public abstract class Player {

    public String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Piece selectPiece();

    public abstract int[] placePiece(Piece piece);


}