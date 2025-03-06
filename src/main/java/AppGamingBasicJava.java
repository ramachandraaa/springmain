public class AppGamingBasicJava {
    public static void main(String[] args) {
        var mariogame=new Mariogame();
        var gamerunner=new GameRunner(mariogame);
        gamerunner.run();
    }

}
