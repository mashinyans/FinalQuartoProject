public abstract class Player {

    public String name;
    public boolean winner;

    public Player(String name) {
        this.name = name;
        this.winner = false;
    }

    public String getName() {
        return name;
    }

    public boolean winner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }


    public abstract int[] makeMove();
}