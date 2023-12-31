package test;
import users.*;
import users.Student;
import users.Teacher;

public class Te {
    public static void main(String[] args) {
        
        Teacher dagm = new Teacher("dagm", 1 , "pass");
        Student ermi = new Student("Ermias", 1);
        Student ermu = new Student("elmo", 2);

        Admin admin = new Admin("admin", 0, "pass");

        admin.addTeacher(dagm);
        admin.enroll_Student(ermi);
        admin.enroll_Student(ermu);

        Teacher abebe = new Teacher("abe", 2, "1234");

        admin.addTeacher(abebe);
        admin.enroll_Student(ermu);

        abebe.updateAttendance(ermu, 1);
        dagm.updateAttendance(ermi, 1);
        System.out.print(dagm.attendancePercentage(ermi, 10));
  
    }

}


    

