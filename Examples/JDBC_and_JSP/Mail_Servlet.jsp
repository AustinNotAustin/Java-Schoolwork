<%@ page import = "javax.servlet.ServletException, javax.servlet.http.HTTPServlet, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse" %>

<jsp:useBean id="MailBean" class="main.MailBean"/>
<jsp:useBean id="MailerBean" class="main.MailerBean"/>
<html>
	<head>
		<title>Austin's Mail Test</title>
	</head>
	
	<body>
		<p>
			Austin Arledge<br>
			ENTD481<br>
			15 May 2021
		</p>
        
        <jsp:setProperty name="MailBean" property="mail" /></p>

        <%


		String to = request.getParameter("to");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
        
        %>

	</body>
</html>
