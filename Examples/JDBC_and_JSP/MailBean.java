import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HTTPServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MailerBean.*;


public class SendMail extends HTTPServlet {
    
	// Constructor
	public MailBean() {
	}

	// Setter for the Mail message
	public void setMail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		reponse.setContentType("text/html");

		String to = request.getParameter("to");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");

		MailerBean.send(to, subject, message);
	}
}
