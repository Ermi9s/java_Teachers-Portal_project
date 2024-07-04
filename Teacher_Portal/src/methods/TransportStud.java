/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

import users.Student;

/**
 *
 * @author hp
 */
public class TransportStud {
    
    static String name;
    static String email;
    static int id;
    
        public TransportStud(Student student)
    {
        this.name = student.getName();
        this.id = student.getId();
        this.email = student.getEmail(); 
    }
    
    public static String getStudName()
    {
        return name;
    }
    public static String getStudemail()
    {
        return email;
    }
    public static int getStudId()
    {
        return id;
    }
    
}
