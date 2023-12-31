package methods;
public class Search 
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
    String[] temp = new String[6];
    temp = Read.markSheet(fileName);
    while(temp != null)
    {
        if(temp[0].equals(String.valueOf(temp)))
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
        if(temp[0].equals(String.valueOf(temp)))
            {
                return temp;
            } 
            
        temp = Read.adminFile(fileName);
    }
    return null;
}

}
