package methods;
public class Search 
{
public static String [] attendance(String fileName , int id)
{
    
    String[] temp = new String[10];
    temp = Read.Attendance(fileName);
    while(temp != null)
    {
        

        if(id == Integer.valueOf(temp[0]))
            {
                return temp;
            } 
            
        temp = Read.Attendance(fileName);
    }
    return null;
}


public static String [] markSheet(String fileName , int id)
{  
    String[] temp = new String[6];
    temp = Read.markSheet(fileName);
    while(temp != null)
    {
        if(id == Integer.valueOf(temp[0]))
            {
                return temp;
            } 
            
        temp = Read.markSheet(fileName);
    }
    return null;
}

public static String [] admin(String fileName , int id)
{  
    String[] temp = new String[3];
    temp = Read.adminFile(fileName);
    while(temp != null)
    {
        if(id == Integer.valueOf(temp[0]))
            {
                return temp;
            } 
            
        temp = Read.adminFile(fileName);
    }
    return null;
}

}
