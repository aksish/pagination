package exception;

/**
 * Created by Aashis Khanal on 8/5/15.
 */
public class AkException extends Exception{
    public AkException(String message){super(message);}
    public AkException(Throwable e){super(e);}
    public AkException(String message, Throwable t){super(message, t);}
}
