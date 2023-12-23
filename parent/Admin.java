package users;
import parent.*;
import methods.*;

public class Admin extends User {
    String attendancefileName;
    String markfileName;

    public Admin(String name, int id, String password) {
        super(name, id, password);
    }

    // Function to create a file with the name "teachername.txt"
    public void addTeacher(Teacher teacher) {        
        Write.toAdmin(teacher);

        this.attendancefileName = teacher.getName() + "(Attendance)" + ".csv";

        Create.attendaceFile(attendancefileName);
        Write.firstLineAttendance(attendancefileName);

        this.markfileName = teacher.getName() + "(Mark)" + ".csv";
        Create.markFile(markfileName);
        Write.firstLineMark(markfileName);
    }


    public void enroll_Student(Student student) {

        Write.newStudentOnMark(student, markfileName);
        Write.newStudentOnAttendance(student, attendancefileName);
    }
}