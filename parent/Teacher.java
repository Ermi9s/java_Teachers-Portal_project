package users;

import parent.*;

public class Teacher extends User {

    String attendaceFileName;
    String markFilename;

    public Teacher(String name, int id, String password) {
        super(name, id, password);

        this.attendaceFileName = name + "(Attendace)";
        this.markFilename = name + "(Mark)";

    }

    // Function to update attendance sheet
    public void updateAttendance(Student student , boolean status) {

        // Code to update attendance sheet

    }

    // Function to update mark sheet
    public void updateMarkSheet(Student student, int quiz, int assignment, int mid, int finalExam) {
        // Code to update mark sheet

    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

}
