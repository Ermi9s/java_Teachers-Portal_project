package methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Input
{
    public static void one(String[] data , String fileName)
    {
        try {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        line = reader.readLine();


        StringTokenizer tokenizer = new StringTokenizer(line, ",");
        
        int i = 0;
        while (tokenizer.hasMoreTokens()) 
            {
                data[i] = tokenizer.nextToken();
                i++;
            }

                reader.close();

            } catch (IOException e) 
                {
                    e.printStackTrace();
                }

    }
}

public class Read {

    public static String[] Attendance(String fileName)
    {
        String [] data = new String[12];
        Input.one(data, fileName);
        return data;
    }

    public static String[] markSheet(String fileName)
    {
        String [] data = new String[6]; 
        Input.one(data, fileName);
        return data;
    }

    public static String[] adminFile(String fileName)
    {
        String [] data = new String[3];
        Input.one(data, fileName);
        return data;
    }

}
