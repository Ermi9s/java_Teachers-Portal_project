package methods;

import java.io.FileWriter;
import java.io.IOException;

public interface Create {

    public static void attendaceFile(String fileName)
    {
                try (FileWriter fileWriter = new FileWriter(fileName)) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public static void markFile(String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName)) {


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
