package exception;

/**
 * Created by Aashis Khanal on 8/5/15.
 */
public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    private final int levelCode;
    private Level(int levelCode){
        this.levelCode = levelCode;
    }

    public int getLevelCode(){
        return this.levelCode;
    }
}
