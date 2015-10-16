package patterns.decorator;

/**
 * Created by Aashis Khanal on 8/18/15.
 */
public class Ground extends PrepareGame{
    public Ground(Game game) {
        super(game);
    }
    public void play(){
        super.play();
        System.out.println("Ground Ready.");
    }
}
