<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New Individual Customer Contact</title>
Create New Individual Customer Contact
</head>
<body>
	<br>
	<s:form action="create_individual_customer_contact" method="post" theme="simple">
	
		<%-- <s:radio name="contact_type" label="Type of Contact "
											list="{'Customer','Vendor'}" theme="xhtml"/> --%>
			<s:div>
				<s:radio name="salutation" label="Enter your Name"
					list="{'Mr.','Ms.','Mrs.'}" theme="xhtml" />
			</s:div>
			<s:div>
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp	
					<s:textfield name="firstname" placeholder="Enter first name here"
					theme="xhtml" />
				<s:textfield name="middlename" placeholder="Enter middle name here"
					theme="xhtml" />
				<s:textfield name="lastname" placeholder="Enter Last name here"
					theme="xhtml" />
			</s:div>
			<br>
			<s:radio name="gender" label="Gender" list="{'male','female'}"
				theme="xhtml" />
			<br>
			<s:div>
				<s:textfield name="phone" placeholder="Enter your phone number"
					label="Your Phone No." type="phone" theme="xhtml" />	
			</s:div>
			<s:div>
				<s:textfield name="emailid" label="E-Mail Id " type="email"
					theme="xhtml" />
			</s:div>
			<s:div>
				<s:textfield name="billing_address" label="Billing Address" type="address" theme="xhtml"/>			
			</s:div>
			<s:div>
				<s:textfield name="shipping_address" label="Shipping Address" type="address" theme="xhtml"/>
			</s:div>
			<s:reset />
			<s:submit value="Create Customer Contact" />
	</s:form>
</body>
</html>