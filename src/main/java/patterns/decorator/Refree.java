package patterns.decorator;

/**
 * Created by Aashis Khanal on 8/18/15.
 */
public class Refree extends PrepareGame{
    public Refree(Game g) {
        super(g);
    }
    public void play() {
       super.play();
        System.out.println("Refree ready...");
    }
}
