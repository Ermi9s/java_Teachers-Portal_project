package methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

interface Input
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

public interface Read {

    public static String[] attendance(String fileName)
    {
        String [] data = new String[13];
        if (Input.one(data, fileName))
        {
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
            String line;
            String csvSplitBy = ",";
            List<String[]> myEntries = new ArrayList<>();
    
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                
                while ((line = br.readLine()) != null) {
                    String[] fields = line.split(csvSplitBy);
                    myEntries.add(fields);
                }
      
            } catch (IOException e) {
                e.printStackTrace();
            }
             return myEntries;
        }

    public static List<String[]> takeTheWholeMark(String fileName)
        {
            String line;
            String csvSplitBy = ",";
            List<String[]> myEntries = new ArrayList<>();
    
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                
                while ((line = br.readLine()) != null) {
                    String[] fields = line.split(csvSplitBy);
                    myEntries.add(fields);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
             return myEntries;
        }
    public static List<String[]> takeTheWholeAdmin()
        {
            String fileName = "Admin.csv";
            String line;
            String csvSplitBy = ",";
            List<String[]> myEntries = new ArrayList<>();
    
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                
                while ((line = br.readLine()) != null) {
                    String[] fields = line.split(csvSplitBy);
                    myEntries.add(fields);
                }
      
            } catch (IOException e) {
                e.printStackTrace();
            }
            return myEntries;
            
        }
}
