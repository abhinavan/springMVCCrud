<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="bean.Student"%>
<c:forEach var="student" items="${list }">
	<p>NAME IS ${student.name}</p>
</c:forEach>