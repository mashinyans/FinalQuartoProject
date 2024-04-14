import java.util.Random;

public class AIPlayer extends Player {
    private Random random = new Random();

    public AIPlayer(String name) {
        super(name);
    }

    public Piece selectPiece() {

        char[] heights = {Piece.TALL, Piece.SHORT};
        char[] colors = {Piece.BLACK, Piece.WHITE};
        char[] shapes = {Piece.SQUARE, Piece.CIRCLE};
        char[] consistencies = {Piece.SOLID, Piece.HOLLOW};

        String pieceAttributes = "" +
                heights[random.nextInt(heights.length)] +
                colors[random.nextInt(colors.length)] +
                shapes[random.nextInt(shapes.length)] +
                consistencies[random.nextInt(consistencies.length)];

        return new Piece(pieceAttributes);
    }


    @Override
    public int[] placePiece(Piece piece) {
        int row = random.nextInt(4);
        int col = random.nextInt(4);
        return new int[]{row, col};
    }


}


