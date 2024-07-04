package methods;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public interface Validate {

    public static Boolean admins(String passkey)
    {
        String password = "admin";
        if(passkey.equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static Boolean teachers(String name , String passkey)
    {
        List<String[]> adminFile = new ArrayList<>();
        adminFile = Read.takeTheWholeAdmin();

        for(int i = 0; i < adminFile.size(); ++i)
        {
            if(adminFile.get(i)[1].equals(name) && adminFile.get(i)[2].equals(passkey))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public static Boolean teacherExist(String name)
    {
        List<String[]> adminFile = new ArrayList<>();
        adminFile = Read.takeTheWholeAdmin();

        for(int i = 0; i < adminFile.size(); ++i)
        {
            if(adminFile.get(i)[1].equals(name))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public static Boolean isSectionValiad(String sec)
    {
        List<String[]> adminFile = new ArrayList<>();
        adminFile = Read.takeTheWholeAdmin();
        
        for(int i = 0; i < adminFile.size();  ++i)
        {
            if(adminFile.get(i)[4].equals(sec))
            {
                return false;
            }   
        }
        
        return true;
    }
    
    public static Boolean isNameValid(String name)
    {
        List<String[]> adminFile = new ArrayList<>();
        adminFile = Read.takeTheWholeAdmin();
        
        for(int i = 0; i < adminFile.size();  ++i)
        {
            if(adminFile.get(i)[1].equals(name))
            {
                return false;
            }   
        }
        
        return true;
        
    }
    
    public static Boolean isValidEmail(String email)
    {
          String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
          Pattern pattern = Pattern.compile(EMAIL_PATTERN);
          Matcher matcher = pattern.matcher(email);
          
          if(matcher.matches())
          {
              return true;
          }
          else
          {
              return false;
          }
    }
    
}
