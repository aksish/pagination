package exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aashis Khanal on 8/5/15.
 */
public abstract class InputProcessingTemplate {

    public  void process (String fileName) {
        IOException processException = null;
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(fileName);
            doProcess(inputStream);
        } catch (IOException e) {
            processException = e;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    if (processException != null) {
                        // throw new AkException(processException + " Error: " + fileName);
                    } else {
                        // throw new AkException(processException + " Error Closing input stream: " + fileName);
                    }
                }
                if (processException != null) {
                    //throw new AkException(processException + " Error Closing input stream: " + fileName);
                }
            }
        }
    }

    public abstract void doProcess(InputStream input) throws IOException;

}
