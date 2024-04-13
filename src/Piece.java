public class Piece {
    public static final char TALL = 'T';
    public static final char SHORT = 'S';
    public static final char BLACK = 'B';
    public static final char WHITE = 'W';
    public static final char SQUARE = 'S';
    public static final char CIRCLE = 'C';
    public static final char SOLID = 'S';
    public static final char HOLLOW = 'H';

    private char height;
    private char color;
    private char shape;
    private char consistency;

    public Piece(String attributes) {
        if (attributes.length() != 4) {
            throw new IllegalArgumentException("Invalid piece attributes. must be 4 characters long.");
        }
        parseAttributes(attributes.toUpperCase());
    }

    private void parseAttributes(String attributes) {
        height = attributes.charAt(0);
        if (height != TALL && height != SHORT) {
            throw new IllegalArgumentException("Invalid height attribute.");
        }

        color = attributes.charAt(1);
        if (color != BLACK && color != WHITE) {
            throw new IllegalArgumentException("Invalid color attribute.");
        }

        shape = attributes.charAt(2);
        if (shape != SQUARE && shape != CIRCLE) {
            throw new IllegalArgumentException("Invalid shape attribute.");
        }

        consistency = attributes.charAt(0);
        if (consistency != SOLID && consistency != HOLLOW) {
            throw new IllegalArgumentException("Invalid consistency attribute.");
        }
    }

    public char getHeight() {
        return height;
    }

    public char getColor() {
        return color;
    }

    public char getShape() {
        return shape;
    }

    public char getConsistency() {
        return consistency;
    }

    @Override
    public String toString() {
        return "" + height + color + shape + consistency;
    }
}
