<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@include file="header.jsp"%>
<style>
form {
    border: 3px solid #f1f1f1;
	width:50%;
	float:left;
}

input[type=text], input[type=password] {
    width: 40%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 20%;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 5px 0 12px 0;
}

img.avatar {
    width: 25%;
    border-radius: 50%;
}

.container {
    padding: 16px;
    text-align:left;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 200px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 50%;
    }</style>
<body>
${msg}
<script type="text/javascript">
function validate() {
	if (document.form1.name.value == "") {
		alert("enter your user name");
		return false;
	}
	if (document.form1.password.value == "") {
		alert("Enter the password");
		return false;
	}

	else {
		alert("Login successfully");
		return true;
	}
}

</script>
		<form:form class="form-horizontal" method="post" name="form1" onsubmit="return validate()" action="perform_login">

  <div class="imgcontainer">
    <img src=<c:url value="/resources/create_thumb.png"/> alt="Avatar" class="avatar">
  </div>
	
  <div class="container">
 
    <label><b>UserName</b></label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="form-control" name="username">
<li>
<td>
<tr>
    <label><b>Password</b></label>&nbsp;&nbsp;
   <input type="password" class="form-control" name="password">
</li>
 
    <button type="submit">Login</button>
<button type="button" class="cancelbtn">Cancel</button>
  </div>
</form:form>
</body>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="footer.jsp" %>
</html>