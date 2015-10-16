package exception;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aashis Khanal on 8/5/15.
 */
public class AppMain {
    public static void main(String[] args) {
        World w = new World();
         try {
             w.method1(-1);
         }
         catch (Exception e){
             e.printStackTrace();
         }

        new InputProcessingTemplate(){
            @Override
            public void doProcess(InputStream input) throws IOException {


            }
        }.process("test.txt");
    }
}
