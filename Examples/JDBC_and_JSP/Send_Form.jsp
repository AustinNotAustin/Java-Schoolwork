<%@ page import = "java.sql.Connection, java.sql.DriverManager, java.sql.ResultSet, java.sql.Statement, java.text.MessageFormat" %>

<html>
    <body>
        
        <h1>Thanks!</h1>
        <h2>Here's the data you entered:</h2>
        <p><%= request.getParameter("custID")%></p>
        <p><%= request.getParameter("fName")%></p>
        <p><%= request.getParameter("lName")%></p>
        <p><%= request.getParameter("email")%></p>
        <p><%= request.getParameter("phoneNum")%></p>


        <% String custID = request.getParameter("custID"); %>
        <% String fName = request.getParameter("fName"); %>
        <% String lName = request.getParameter("lName"); %>
        <% String email = request.getParameter("email"); %>
        <% String phoneNum = request.getParameter("phoneNum"); %>

        <p><%
            
            String execute = MessageFormat.format("insert into formInput (CustomerID, fName, lName, email, phoneNum) values ({0}, \'''" + fName + "\''', \'''" + lName + "\''', \'''" + email + "\''', {1});", custID, phoneNum);

            try {
			    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week3", "austin", "pass");
			
		        Statement stmnt = conn.createStatement();

                ResultSet result = stmnt.executeQuery("use week3;");
            
                stmnt.executeUpdate(execute);

		} catch (Exception e) {
			out.print(e);
		}
        %></p>
        
        <p><%  %></p>
        <p><%  %></p>

    </body>
</html>
