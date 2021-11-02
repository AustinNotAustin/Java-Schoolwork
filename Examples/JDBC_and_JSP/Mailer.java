import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {

    public static void send(String to, String subject, String message){

        // Declare the username and password

        final String user = "mail@austinarledge.com";
        final String password = "passwurd123";

        // Create a session

        Properties properties = new Properties();
        
        properties.put("mail.smtp.host", "mail.austinarledge.com");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties, new javax.mailAuthenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user,password);
            }
        });

        // Create a message and send it

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(message);

            Transport.send(message);

            System.out.println("Message sent!");
        } catch (MessagingException e) {
            throw new RuntiemException(e);
        }

    }
}
