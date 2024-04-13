import java.util.Random;

public class AIPlayer extends Player {
    private Random random;

        public AIPlayer(String name) {
            super(name);
            random = new Random();
        }

        // Method for AI to make a move
        @Override
        public int[] makeMove() {
            // Generate random row and column for the move
            int row = random.nextInt(4);
            int col = random.nextInt(4);
            return new int[]{row, col};
        }
    }


