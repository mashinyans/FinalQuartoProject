public class Piece {
    private boolean isTall;
    private boolean isSquare;
    private boolean isDark;
    private boolean isSolid;

    public Piece(boolean isTall, boolean isSquare, boolean isDark, boolean isSolid) {
        this.isTall = isTall;
        this.isSquare = isSquare;
        this.isDark = isDark;
        this.isSolid = isSolid;
    }

    public boolean isTall() {
        return this.isTall;
    }

    public boolean isSquare() {
        return this.isSquare;
    }

    public boolean isDark() {
        return this.isDark;
    }

    public boolean isSolid() {
        return this.isSolid;
    }
}
