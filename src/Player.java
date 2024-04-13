public abstract class Player {

    public String name;
    public boolean Winner;

    public Player(String name) {
        this.name = name;
        this.Winner = false;
    }

    public String getName() {
        return name;
    }

    public boolean isWinner() {
        return Winner;
    }

    public void setWinner(boolean winner) {
        this.Winner = winner;
    }

    // Abstract method to make a move, forcing subclasses to implement it
    public abstract int[] makeMove();
}