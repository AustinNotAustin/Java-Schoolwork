<%@ page import = "java.sql.Connection, java.sql.DriverManager, java.sql.ResultSet, java.sql.Statement, java.text.MessageFormat" %>

<html>
    <body>
        
        <h1>Message sent successfully</h1>
        <h2>I'll get back to you as soon as I can!</h2>
        <h2>Here's the data you entered:</h2>
        <p>Name: <%= request.getParameter("name")%></p>
        <p>Email: <%= request.getParameter("email")%></p>
        <p>Phone Number: <%= request.getParameter("phoneNum")%></p>
        <p>Message: <%= request.getParameter("message")%></p>


        <% String name = request.getParameter("name"); %>
        <% String email = request.getParameter("email"); %>
        <% String phoneNum = request.getParameter("phoneNum"); %>
        <% String message = request.getParameter("message"); %>

        <p><%
            
            String execute = "insert into formInput (name, email, phoneNum, message) values (\"" + name + "\", \"" + email + "\", \"" + phoneNum + "\", \"" + message + "\");";


            try {
			    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week4", "austin", "pass");
			
		        Statement stmnt = conn.createStatement();

                ResultSet result = stmnt.executeQuery("use week4;");
            
                stmnt.executeUpdate(execute);

		} catch (Exception e) {
			out.print(e);
		}

        %></p>

        
        
        <p><br>This is what the MySQL string would now look like: <br><%= execute %></p>

    </body>
</html>
