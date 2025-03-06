public class GameRunner {
    Mariogame game;
    public GameRunner(Mariogame game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Game running "+game);
        game.down();
        game.left();
        game.up();
        game.right();
    }
}
