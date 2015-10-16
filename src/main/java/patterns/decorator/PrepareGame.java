package patterns.decorator;

/**
 * Created by Aashis Khanal on 8/18/15.
 */
public class PrepareGame implements Game{
    Game game;
    public PrepareGame(Game g){
        game = g;
    }
    public void play() {
        game.play();
    }
}
