<html>
<head>
    <title>Email Form</title>
</head>
<body>

  <h1>Mail Servlet Testing</h1>

  <form action="SendMail." method="POST">
    <label for="to">To: </label><br>
    <input type="text" name="to" id="to"><br>
    <label for="subject">Subject: </label><br>
    <input type="text" name="subject" id="subject"><br>
    <label for="message">Message: </label><br>
    <textarea name="message" id="message" cols="30" rows="10"></textarea><br>
    <input type="submit" value="Submit">
  </form>

</html>
