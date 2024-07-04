/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmail {
    static String email;
    static String teacherName;
    static String message;
    
    public SendEmail(String ema , String teachern , String mess)
    {
        this.email = ema;
        this.message = mess;
        this.teacherName = teachern;
    }
    
    public boolean send()throws Exception
    {
        if(sendEmail(SendEmail.email))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
  
    public static boolean sendEmail(String recipent) throws Exception{
        Properties properties = new Properties();
        String username = "ermiayele74@gmail.com";
        String password = "purp uvlm ypji lcng";

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");


        Authenticator authenticate = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        };

        Session session = Session.getInstance(properties, authenticate);

        Message message = prepareMessage(session,username, recipent);
        Transport.send(message);
        return true;
        }

    private static Message prepareMessage(Session session,String username, String recipent){        
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipent));
            message.setSubject("email from instructor: " + SendEmail.teacherName);
            message.setText(SendEmail.message);
            return message;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    } 
     
}
    
    
    

