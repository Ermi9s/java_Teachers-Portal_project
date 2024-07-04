package methods;

import java.util.ArrayList;
import java.util.List;

public interface Search 
{
public static String [] attendance(String fileName , int id)
{
    
    String[] temp = new String[10];
    temp = Read.attendance(fileName);
    while(temp != null)
    {
        if(temp[0].equals(String.valueOf(temp)))
            {
                return temp;
            } 
            
        temp = Read.attendance(fileName);
    }
    return null;
}


public static String [] markSheet(String fileName , int id)
{  
        List<String[]> markFile = new ArrayList<>();
         markFile = Read.takeTheWholeMark(fileName);
        for(int i = 1; i < markFile.size(); ++i)
        {
            if(Integer.parseInt(markFile.get(i)[0]) == id)
            {
                return markFile.get(i);
            }
        }
        
        String[] empty = new String[6];
        return empty;
}

public static String [] admin(String fileName , String name)
{  
        List<String[]> adminFile = new ArrayList<>();
        adminFile = Read.takeTheWholeAdmin();

        for(int i = 0; i < adminFile.size(); ++i)
        {
            if(adminFile.get(i)[1].equals(name))
            {
                return adminFile.get(i);
            }
        }
        
        String[] empty = new String[5];
        return empty;
}
}
