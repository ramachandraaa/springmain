import com.ramdev.demo.supercon;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var game=new supercon();
      var game=new Mariogame();
        var gamerunner=new GameRunner(game);
        gamerunner.run();
    }

}
