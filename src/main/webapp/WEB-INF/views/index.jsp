<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<!--<script type="text/javascript" src='./js/closure-library/closure/goog/base.js'></script>-->
    <spring:url value="/resources/js/closure-library/closure/goog/base.js" var="base_js"></spring:url>
    <spring:url value="/resources/js/index.js" var="indexJs"></spring:url>
    <spring:url value="/resources/js/jquery-1.11.3.js" var="jqueryJs"></spring:url>
    <spring:url value="/resources/css/index.css" var="indexCss"></spring:url>
    
    <link type="text/css" rel="stylesheet" href="${indexCss}"></link>
    
    <script type="text/javascript" src="${base_js}"></script>
    <script type="text/javascript" src="${indexJs}"></script>
</head>
<body>
	<div class="header">NYU Shanghai ELS Reservation System</div>
	<div class="Part">
		<p>Please have a check with the availability before you come to
			the desk for reservation!</p>
		<table class="tb">
			<thead colspan="2"><td>Equipment Availability</td></thead>
			<tbody>
				<tr>
					<td>MacBook Air</td>
					<td>Label-LP no.</td>
				</tr>
				<tr>
					<td>Cameras</td>
					<td>Label-CA no.</td>
				</tr>
				<tr>
					<td>Video Cameras</td>
					<td>Label-VC no.</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="footer">
		<p class="footer">ATS @ NYUShanghai</p>
		<p class="footer">Copyright 2015</p>
	</div>
</body>
</html>
