<!doctype html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
<%--    <meta name="viewport"--%>
<%--          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="ie=edge">--%>
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="vaccine.css">
</head>
<body>
<div class="topRectangle">dd</div>
<div class="blueRectangle">접종내역 보기</div>
<div class="greyRectangle">진료기록 보기</div>
<table>
    <c:forEach items="${vaccinationRecords}" var="record">
        <tr>
            <td>${record.inoculationName}</td>
            <td>${record.dosesReceived>0 ? 'o':'x'}</td>
        </tr>
    </c:forEach>
<%--    <tr>--%>
<%--        <td>파상풍</td>--%>
<%--        <td>o</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td>코로나</td>--%>
<%--        <td>o</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td>aa</td>--%>
<%--        <td>0</td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td>dd</td>--%>
<%--        <td>o</td>--%>
<%--    </tr>--%>
</table>
</body>
</html>
