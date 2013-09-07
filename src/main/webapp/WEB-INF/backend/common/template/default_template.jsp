<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title><tiles:getAsString name="title"/></title>
</head>
<body>
	<div id="page">
	    <tiles:insertAttribute name="constant-toolbar"/>
		<div id="wrap">
			<tiles:insertAttribute name="constant-header"/>
			<tiles:insertAttribute name="main-content1"/>
			<tiles:insertAttribute name="main-content2"/>
			<tiles:insertAttribute name="main-content3"/>
			<tiles:insertAttribute name="main-content4"/>
			<tiles:insertAttribute name="main-content5"/>
			<tiles:insertAttribute name="main-content6"/>
			<tiles:insertAttribute name="main-content7"/>
		</div>  <!-- #wrap END -->
	</div>  <!-- #page END -->
	<tiles:insertAttribute name="constant-footer"/>
</body>
</html>