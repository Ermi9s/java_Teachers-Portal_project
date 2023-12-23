package users;
public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Function to calculate the result out of 100%
    public double calculateResult(int quiz, int assignment, int mid, int finalExam) {
        // Code to calculate the result
        return (quiz + assignment + mid + finalExam) / 4.0;
    }

    // Function to calculate attendance percentage
    public double calculateAttendancePercentage(int presentCount, int totalCount) {
        // Code to calculate attendance percentage
        return (presentCount / (double) totalCount) * 100.0;
    }
}