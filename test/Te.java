import users.Admin;
import users.Student;
import users.Teacher;

public class Te {
    public static void main(String[] args) {
        
        Teacher dagm = new Teacher("dagm", 1 , "pass");
        Student ermi = new Student("Ermias", 1);

        Admin admin = new Admin("admin", 0, "pass");

        dagm.updateAssignment(ermi, 20);
        dagm.updateAttendance(ermi, 4);
        dagm.updateAttendance(ermi, 6);

        dagm.updateAttendance(ermi, 2);
        dagm.updateAttendance(ermi, 1);
        dagm.updateFinal(ermi, 50);
        dagm.updateMid(ermi, 23);
        dagm.updateQuiz(ermi, 5);

    }

}


    

