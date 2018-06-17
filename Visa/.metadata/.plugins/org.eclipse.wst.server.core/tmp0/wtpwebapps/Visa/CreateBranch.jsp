<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Branch</title>
</head>
<body>
<h1>Create Branch</h1>
<form action="Branch" method="post">
<table>
<tr><td>Branch Name:</td><td><input type="text" name="bname"></td></tr>
<tr><td>Branch Address:</td><td><input type="text" name="baddress"></td></tr>
<tr><td>Branch Location:</td><td><input type="text" name="blocation"></td></tr>
<tr><td>Branch Contact:</td><td><input type="text" name="bcontact"></td></tr>
<tr><td>Branch Email:</td><td><input type="text" name="bemail"></td></tr>
<tr><td>Branch-Created-Date:</td><td><input type="date" name="date"></td></tr>

<tr><td><input type="submit" value="Create"></td></tr>

</table>
</form>
</body>
</html>