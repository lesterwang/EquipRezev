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
	<h1>NYU Shanghai ELS Reservation System</h1>
	<div id="result"></div>
	<div id="Part1">
		<p>Please have a check with the availability before you come to
			the desk for reservation!</p>
		<table>
			<thead colspan="2">Equipment Availability
			</thead>
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
</body>
</html>
