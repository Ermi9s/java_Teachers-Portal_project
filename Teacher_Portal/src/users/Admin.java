package users;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import parent.*;
import methods.*;

public class Admin extends User {
    String attendancefileName;
    String markfileName;

    public Admin(String name, int id, String password,String email , String sec) {
        super(name, id, password , email , sec);
    }

    // Function to create a file with the name "teachername.txt"
    public void addTeacher(Teacher teacher , String sec) {        
        Write.toAdmin(teacher);

        this.attendancefileName = teacher.getName() + sec + "(Attendance)" + ".csv";

        Create.attendaceFile(attendancefileName);
        Write.firstLineAttendance(attendancefileName);

        this.markfileName = teacher.getName() + sec + "(Mark)" + ".csv";
        Create.markFile(markfileName);
        Write.firstLineMark(markfileName);
    }


    public void enroll_Student(Student student) {

        Write.newStudentOnMark(student, markfileName);
        Write.newStudentOnAttendance(student, attendancefileName);
    }
    
    public Boolean updateEmail(Teacher teacher , String newEmail)
    {
        if(Password.isValidEmail(newEmail))
        {
            List<String[]> file = new ArrayList();
            file = Read.takeTheWholeAdmin();

            for(int i = 0; i < file.size(); ++i)
            {
                if(file.get(i)[0].equals(String.valueOf(teacher.getId())))
                {
                    file.get(i)[3] = newEmail;
                }
            }
            Write.overWrite("Admin.csv", file);
            
            return true;
        }
        else
        {
            return false;   
        }
        
    }
    
    public Boolean updateName(Teacher teacher , String newName)
    {
        if(Password.isNameValid(newName))
        {
            List<String[]> file = new ArrayList();
            file = Read.takeTheWholeAdmin();

            for(int i = 0; i < file.size(); ++i)
            {
                if(file.get(i)[0].equals(String.valueOf(teacher.getId())))
                {
                    file.get(i)[1] = newName;
                }
            }
            String oldAtt = teacher.attendaceFileName;
            String oldMar = teacher.markFilename;
            String newAtt = newName + teacher.getSec() +"(Attendance)" + ".csv";
            String newMar = newName + teacher.getSec() +"(Mark)" + ".csv";
            
             List<String[]> oldAfile = new ArrayList();
             List<String[]> oldMfile = new ArrayList();
             oldAfile = Read.takeTheWholeAttendance(oldAtt);
             oldMfile = Read.takeTheWholeMark(oldMar);
             
            Write.overWrite(newAtt, oldAfile);
            Write.overWrite(newMar, oldMfile);
            Write.overWrite("Admin.csv", file);
            
            File delA = new File(oldAtt);
            File delM = new File(oldMar);
            delA.delete();
            delM.delete();
            
            return true;

        }
        else
        {
            return false;
        }

    }
        
    public void updatePassword(Teacher teacher , String newPass)
    {
        List<String[]> file = new ArrayList();
        file = Read.takeTheWholeAdmin();
        
        for(int i = 0; i < file.size(); ++i)
        {
            if(file.get(i)[0].equals(String.valueOf(teacher.getId())))
            {
                file.get(i)[2] = newPass;
            }
        }
        Write.overWrite("Admin.csv", file);
    }
    
    public Boolean updateSection(Teacher teacher , String newSec)
    {
        if(Password.isSectionValiad(newSec))
        {
          List<String[]> file = new ArrayList();
          file = Read.takeTheWholeAdmin();
        
            for(int i = 0; i < file.size(); ++i)
            {
                if(file.get(i)[0].equals(String.valueOf(teacher.getId())))
                {
                    file.get(i)[4] = newSec;
                }
            }
            String oldAtt = teacher.attendaceFileName;
            String oldMar = teacher.markFilename;
            String newAtt = teacher.getName() + newSec +"(Attendance)" + ".csv";
            String newMar = teacher.getName() + newSec +"(Mark)" + ".csv";
            
             List<String[]> oldAfile = new ArrayList();
             List<String[]> oldMfile = new ArrayList();
             oldAfile = Read.takeTheWholeAttendance(oldAtt);
             oldMfile = Read.takeTheWholeMark(oldMar);
             
            Write.overWrite(newAtt, oldAfile);
            Write.overWrite(newMar, oldMfile);
            Write.overWrite("Admin.csv", file);
            
            File delA = new File(oldAtt);
            File delM = new File(oldMar);
            delA.delete();
            delM.delete();
            
            return true;
            
        }
        else
        {
            return false;
        }

    }
    
}