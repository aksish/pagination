package exception;

/**
 * Created by Aashis Khanal on 8/5/15.
 */
public class World {
    public void method1(int i) throws AkException{
        System.out.println("hello------");
        if(i<0) throw new AkException("Less than Zero exception.");
        System.out.println("hello------");
    }

    public static void main(String[] args) {
        World w = new World();
        try{
            w.method1(-1);
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
