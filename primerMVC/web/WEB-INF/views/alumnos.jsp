<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="alumno" action="alumnos" method="POST">
		<form:input path="nombre" />
		<form:input path="apellidos" />
		<form:button>Enviar</form:button>
	</form:form>
</body>
</html>