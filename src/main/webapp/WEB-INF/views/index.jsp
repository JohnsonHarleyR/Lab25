<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />

<meta charset="ISO-8859-1">
<title>Local Weather</title>
</head>
<body>

<!-- Header -->
<section class="header">

</section>

<!-- MainBody -->
<main class="container">

<section id="top">

<h1>Local Weather</h1>

<i>${now}
<br>
${location}
</i>

</section>

<section id="weather">


<c:forEach var="day" items="${days}">
<p class="wday">




<!-- put days forecast -->
<c:choose>
<c:when test="${day == 'Today' }">
<article>
<!-- The day -->

<h2>${day}</h2>



<!-- The night -->
<h2>Tonight</h2>

</article>

</c:when>
<c:otherwise>

<article>

<!-- The day -->
<h2>${day}</h2>


<!-- The day -->
<h2>${day} Night</h2>

</article>
</c:otherwise>
</c:choose>
</p>
</c:forEach>



</section>


</main>

</body>
</html>