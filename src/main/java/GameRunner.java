import com.ramdev.demo.gamingconsole;
import com.ramdev.demo.supercon;

public class GameRunner {
    gamingconsole game;
    public GameRunner( gamingconsole game) {
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
