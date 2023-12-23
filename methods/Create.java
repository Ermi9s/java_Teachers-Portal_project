package methods;

import java.io.FileWriter;
import java.io.IOException;

public class Create {

    public static void attendaceFile(String fileName)
    {
                try (FileWriter fileWriter = new FileWriter(fileName)) {

            // ola amigos euv new zrya message to let the u now the success  

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public static void markFile(String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName)) {

            // file created message

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
