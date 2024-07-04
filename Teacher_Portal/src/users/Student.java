package users;
public class Student {
    private String name;
    private int id;
    private String email;

    public Student(String name, int id , String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
   public String getEmail() {
        return email;
    }

    public double calculatGrade(int quiz, int assignment, int mid, int finalExam) 
    {
        double res;
        res = ((quiz + assignment + mid + finalExam) * 4.00)/100;
        return res;
    }

}