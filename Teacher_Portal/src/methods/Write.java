package methods;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import users.*;


public interface Write {

    public static void toAdmin(Teacher teacher)
    {
            try (FileWriter fileWriter = new FileWriter("Admin.csv", true)) {
            String teacherInfo = teacher.getId() + "," + teacher.getName() + "," + teacher.getPassword()+ "," + teacher.getemail()+ "," + teacher.getSec() +"\n";
            fileWriter.write(teacherInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void firstLineAttendance(String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write("ID,STUDENT_NAME,1,2,3,4,5,6,7,8,9,10,Email\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void firstLineMark(String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {

            fileWriter.write("ID,STUDENT_NAME,QUIZ,MID_TERM,ASSIGNMENT,FINAL\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void newStudentOnAttendance(Student student , String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {

            String studentInfo = student.getId() + "," + student.getName()+ "," + "A"+"," +"A" +"," + "A"  + "," +"A" + "," + "A"  + "," +"A" + "," + "A"  + "," +"A" + "," + "A"  + "," + "A" + "," + student.getEmail() + "\n";
            fileWriter.write(studentInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void newStudentOnMark(Student student , String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            String studentInfo = student.getId() + "," + student.getName() + "," + "0" + "," + "0" + "," + "0" + "," + "0" + "\n";
            fileWriter.write(studentInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void overWrite(String fileName , List <String[]> data)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            for (String[] row : data) {
                fileWriter.write(String.join(",", row));
                fileWriter.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static int getnewId()
    {
        List<String[]> adminFile = new ArrayList<>();
        adminFile = Read.takeTheWholeAdmin();
        
        return adminFile.size() + 1;
    }
    
    public static int getNewStudId(String fileName)
    {
        List<String[]> file = new ArrayList<>();
        file = Read.takeTheWholeAttendance(fileName);
        
        return file.size() + 1;
    }
   
}
