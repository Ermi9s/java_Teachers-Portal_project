package methods;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import users.*;


public class Write {

    public static void toAdmin(Teacher teacher)
    {
            try (FileWriter fileWriter = new FileWriter("Admin.csv", true)) {
            // Append teacher information to the CSV file
            String teacherInfo = teacher.getId() + "," + teacher.getName() + "," + teacher.getPassword() + "\n";
            fileWriter.write(teacherInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void firstLineAttendance(String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            // Append initial information to the CSV file
            fileWriter.write("ID,STUDENT_NAME,1,2,3,4,5,6,7,8,9,10\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void firstLineMark(String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            // Append initial information to the CSV file
            fileWriter.write("ID,STUDENT_NAME,QUIZ,MID_TERM,ASSIGNMENT,FINAL,\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void newStudentOnAttendance(Student student , String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            // Append student information to the CSV file
            String studentInfo = student.getId() + "," + student.getName() + "\n";
            fileWriter.write(studentInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void newStudentOnMark(Student student , String fileName)
    {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            // Append student information to the CSV file
            String studentInfo = student.getId() + "," + student.getName() + "\n";
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
}
