<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="context" value="${pageContext.request.contextPath}" />

<spring:url var="css" value="/resoureces/css" />
<spring:url var="js" value="/resoureces/js" />
<spring:url var="images" value="/resoureces/images" />


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Mobile - ${title}</title>

<!-- style for boostrap -->



<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">


<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<script type="text/javascript">
		window.menu = '${title}';
	</script>


	<!-- Loading the nava bar -->

	<%@include file="./shared/nav.jsp"%>

	<!-- Loading the home page -->

<!-- Loading the content -->

<div class="wrapper">

	<div class="content">
	
	<c:if test="${userClickHome==true}">
		<%@include file="./shared/home.jsp"%>
	</c:if>

	<!-- Loading the About page -->

	<c:if test="${userClickAbout==true}">
		<%@include file="about.jsp"%>
	</c:if>

	<c:if test="${userClickContact==true}">
		<%@include file="contact.jsp"%>
	</c:if>

</div>


	<!-- Loading the footer -->

	<%@include file="./shared/footer.jsp"%>

 


	<!-- JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.min.js"></script>

	<!-- Self coded js file -->	

	<script src="${js}/myapp.js"></script>
	
	


    </div>
</body>

</html>