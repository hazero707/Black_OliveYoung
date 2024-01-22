<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title"></tiles:getAsString> </title>
<link href='${pageContext.request.contextPath}<tiles:getAsString name="css" />' rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>

<!-- header -->
<tiles:insertAttribute name="header"/>

<!-- content -->
<tiles:insertAttribute name="content"/>

<!-- footer -->
<tiles:insertAttribute name="footer"/>

</body>
</html>