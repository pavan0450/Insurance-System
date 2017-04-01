<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
*{
    box-sizing: border-box;
}
body {
    font-family: "Times New Roman";
    background-color: gainsboro;
    margin-bottom: 30px;
    margin-left: 150px;
    margin-right: 150px;
}
#userlogin,#aside{
    background-color: white;
    border-radius: 3px;
    padding: 20px;
    margin-bottom: 20px;
    margin-left: 20px;
    margin-right: 20px;


}
#userlogin {
width: 38%;
    float: left;
    display: block;
}
#aside{
    width: 50%;
    float: right;
    display: block;
}
</style>
<body>

	<h2 align="center">
		Insurance System with <br>Tracking Manager
	</h2>

	<div id="userlogin">
		<table>
			<tr>
				<td><p>
					<h3>UserLogin</h3>
					</p>
			</tr>
			<tr>
				<td>Username:
				<td><input type="text" name="username">
			</tr>
			<tr>
				<td>Password:
				<td><input type="password" name="password">
			</tr>
			<tr>
			<td><input type="submit" value="Login">
			</tr>
		</table>
	</div>
	<div id="aside">
	<table>
			<tr>
				<td><p>
					<h3>EmployeeLogin</h3>
					</p>
			</tr>
			<tr>
				<td>Username:
				<td><input type="text" name="username">
			</tr>
			<tr>
				<td>Password:
				<td><input type="password" name="password">
			</tr>
			<tr>
			<td align="center"><input type="submit" value="Login">
			</tr>
		</table>
	
	
	
	</div> 


</body>
</html>