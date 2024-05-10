public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            Player player1 = new HumanPlayer();
            Player player2 = new HumanPlayer();
            Game game = new Game(player1, player2);
            game.start();
        } catch (Exception var4) {
            Exception e = var4;
            System.out.println("Error starting the game: " + e.getMessage());
            e.printStackTrace();
        }

    }
}

