/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

import users.Student;
import users.Teacher;

/**
 *
 * @author hp
 */
public class Transporter {
    static String name;
    static String email;
    static String password;
    static String sec;
    static int id;
    public Transporter(int id , String name , String password , String email ,String sec)
    {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.sec = sec;   
    }
    public Transporter(Teacher teacher)
    {
        this.name = teacher.getName();
        this.id = teacher.getId();
        this.email = teacher.getemail();
        this.password = teacher.getPassword();
        this.sec = teacher.getSec();
         
    }

    
    public static String getName()
    {
        return name;
    }
    public static String getPassword()
    {
        return password;
    }
    public static String getEmail()
    {
        return email;
    }
    public static int getId()
    {
        return id;
    }
    public static String getSec()
    {
        return sec;
    }
    
}
