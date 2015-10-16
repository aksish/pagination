package patterns.decorator;

/**
 * Created by Aashis Khanal on 8/18/15.
 */
public class AppMain {
    public static void main(String[] args) {
        Game game = new Refree(
                        new Ground(
                            new Football()));
        game.play();
    }
}
