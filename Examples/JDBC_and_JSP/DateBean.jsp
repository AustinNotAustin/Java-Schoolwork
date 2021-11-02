<jsp:useBean id="DateBean" class="main.DateBean"/>
<html>
	<head>
		<title>Austin's Date Test</title>
	</head>
	
	<body>
		<p>
			Austin Arledge<br>
			ENTD481<br>
			06 May 2021
		</p>
		<p>Today is <jsp:getProperty name="DateBean" property="date" /></p>
	</body>
</html>
