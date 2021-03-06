<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<sx:head />
</head>
<body>
	Inventory Management System
	<br> Registration Page
	<br> Enter your details
	<br>
	<br>
	<s:div>
		<s:form action="register" method="post" theme="simple">

			<s:div>
				<s:radio name="salutation" label="Enter your Name" list="{'Mr.','Ms.','Mrs.'}" theme="xhtml" />
			</s:div>

			<s:div>
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp	
				<s:textfield name="firstname" placeholder="Enter first name here" theme="xhtml" />
				<s:textfield name="middlename" placeholder="Enter middle name here" theme="xhtml" />
				<s:textfield name="lastname" placeholder="Enter Last name here" theme="xhtml" />
			</s:div>
			
			<br>
			<s:div>
				<sx:datetimepicker name="dateofbirth" label="Date of Birth" displayFormat="dd-MM-yyyy" />
			</s:div>
			
			<br>
			<s:radio name="gender" label="Gender" list="{'male','female'}" theme="xhtml" />
			<br>
			
			<br>
			<s:div>
				<s:textfield name="userid" label="User Id " placeholder="Create a new unique User Id" theme="xhtml" />
			</s:div>
			
			<br>
			<s:div>
				<s:password name="password" label="Password" placeholder="At least 6 characterss" theme="xhtml" />
			</s:div>
			
			<br>
			<s:div>
				<s:password name="confirmpassword" label="Reenter password" placeholder="please reenter your password" theme="xhtml" />
			</s:div>
			
			<br>
			<s:div>
				<s:textfield name="phone" placeholder="Enter your phone number" label="Phone No." theme="xhtml" />
			</s:div>
			
			<br>
			<s:div>
				<s:textfield name="emailid" label="E-Mail Id " type="email" theme="xhtml" />
			</s:div>
			<br>
			<s:div>
				<s:textfield name="address" label="Address " type="address" theme="xhtml" />
			</s:div>
			<br>
			<s:reset />
			<s:submit value="Create your Account" />

		</s:form>
	</s:div>
</body>
</html>