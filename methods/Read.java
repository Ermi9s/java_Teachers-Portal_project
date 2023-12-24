package methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Input
{
    public static boolean one(String[] data , String fileName)
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            line = reader.readLine();

            if(line == null)
            {
                reader.close();
                return false;
            }

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
                return true;
            

    }
}

public class Read {

    public static String[] attendance(String fileName)
    {
        String [] data = new String[12];
        if (Input.one(data, fileName))
        {
            Input.one(data, fileName);
            return data;
        }
        else
        {
            return null;
        }

    }

    public static String[] markSheet(String fileName)
    {
        String [] data = new String[6]; 
        if (Input.one(data, fileName))
        {
            Input.one(data, fileName);
            return data;
        }
        else
        {
            return null;
        }
    }

    public static String[] adminFile(String fileName)
    {
        String [] data = new String[3];
        if (Input.one(data, fileName))
        {
            Input.one(data, fileName);
            return data;
        }
        else
        {
            return null;
        }
    }

    public static List<String[]> takeTheWholeAttendance(String fileName)
        {
            String[] temp = new String[12];
            List<String[]> csvBody = new ArrayList<>();
            while((temp = Read.attendance(fileName)) != null)
            {
                csvBody.add(temp);   
            }     
            return csvBody;
        }

    public static List<String[]> takeTheWholeMark(String fileName)
        {
            String[] temp = new String[6];
            List<String[]> csvBody = new ArrayList<>();
            while((temp = Read.markSheet(fileName)) != null)
            {
                csvBody.add(temp);   
            }     
            return csvBody;
        }
    public static List<String[]> takeTheWholeAdmin(String fileName)
        {
            String[] temp = new String[3];
            List<String[]> csvBody = new ArrayList<>();
            while((temp = Read.adminFile(fileName)) != null)
            {
                csvBody.add(temp);   
            }     
            return csvBody;
        }
}
