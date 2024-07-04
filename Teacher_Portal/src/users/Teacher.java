package users;

import java.util.ArrayList;
import java.util.List;
import methods.*;
import parent.*;

public class Teacher extends User {

    String attendaceFileName;
    String markFilename;
    int studNum;

    public Teacher(String name, int id, String password , String email , String sec) {
        super(name, id, password , email , sec);

        this.attendaceFileName = name + sec +"(Attendance)" + ".csv";
        this.markFilename = name + sec  + "(Mark)" + ".csv";

    }
    public String getAttendanceFileName()
    {
        return attendaceFileName; 
    }
    
    public void enroll_Student(Student student) {

        Write.newStudentOnMark(student, markFilename);
        Write.newStudentOnAttendance(student, attendaceFileName);
    }

    public void updateAttendance(Student student , int day){        
        List<String[]> body = new ArrayList<>();
        body = Read.takeTheWholeAttendance(attendaceFileName);

        for(int i = 0; i < body.size(); ++i)
        {
            if(body.get(i)[0].equals(String.valueOf(student.getId())))
                {
                    body.get(i)[day+1] ="P";
                    break;
                }
        }

        Write.overWrite(attendaceFileName, body);
    }

    public void updateQuiz(Student student, int quiz) 
        {
            List<String[]> body = new ArrayList<>();
            body = Read.takeTheWholeMark(markFilename);
            for(int i = 0; i < body.size(); ++i)
                {
                    if(body.get(i)[0].equals(String.valueOf(student.getId())))
                        {
                            body.get(i)[2] = String.valueOf(quiz);
                            break;
                        }
                }
            Write.overWrite(markFilename, body);
        }

    public void updateMid(Student student, int mid) 
        {
            List<String[]> body = new ArrayList<>();
            body = Read.takeTheWholeMark(markFilename);
            for(int i = 0; i < body.size(); ++i)
                {
                   
                    if(body.get(i)[0].equals(String.valueOf(student.getId())))
                        {
                            body.get(i)[3] = String.valueOf(mid);
                            break;
                        }
                }

            Write.overWrite(markFilename, body);
        }

    public void updateAssignment(Student student, int ass) 
        {
            List<String[]> body = new ArrayList<>();
            body = Read.takeTheWholeMark(markFilename);
            for(int i = 0; i < body.size(); ++i)
                {
                    
                    if(body.get(i)[0].equals(String.valueOf(student.getId())))
                        {
                            body.get(i)[4] = String.valueOf(ass);
                            break;
                            
                        }
                }
            Write.overWrite(markFilename, body);
        }
    public void updateFinal(Student student, int fin) 
        {
            List<String[]> body = new ArrayList<>();
            body = Read.takeTheWholeMark(markFilename);
            for(int i = 0; i < body.size(); ++i)
                {
                    if(body.get(i)[0].equals(String.valueOf(student.getId())))
                        {
                            body.get(i)[5] = String.valueOf(fin);
                            break;
                        }
                        
                }
            Write.overWrite(markFilename, body);
        }

    public float attendancePercentage(Student student , int outOf) 
        {
            int count = 0;
            float res;
            List<String[]> body = new ArrayList<>();
            body = Read.takeTheWholeAttendance(attendaceFileName);
            for(int i = 0; i < body.size(); ++i)
                {
                    if(body.get(i)[0].equals(String.valueOf(student.getId())))
                        {
                            for(int j =0; j < body.get(i).length; j++)
                            {
                                if(body.get(i)[j].equals("P"))
                                {
                                    count += 1;
                                }
                            }
                        }
                        
                }

            res = (count * 100)/outOf;
            return res;
        }
    
    public void removeStud(Student student)
    {
       List<String[]> body = new ArrayList<>();
       body = Read.takeTheWholeMark(markFilename);
         for(int i = 0; i < body.size(); ++i)
            {
            if(body.get(i)[0].equals(String.valueOf(student.getId())))
                {
                    body.remove(i);
                    break;
                }

            }
            Write.overWrite(markFilename, body);
            
        List<String[]> file = new ArrayList<>();
        file = Read.takeTheWholeAttendance(attendaceFileName);

        for(int i = 0; i < file.size(); ++i)
        {
            if(file.get(i)[0].equals(String.valueOf(student.getId())))
                {
                    file.remove(i);
                    break;
                }
        }

        Write.overWrite(attendaceFileName, file);
     
    }
    
    
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public String getemail() {
        return email;
    }
    
   public String getSec() {
        return section;
    }

    public int getId() {
        return id;
    }
    
    public int countStudents()
    {
        List<String[]> body = new ArrayList<>();
        body = Read.takeTheWholeAttendance(attendaceFileName);
        
        return body.size() - 1;
        
    }

}
