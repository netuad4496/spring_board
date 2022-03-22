<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>Demo List Page</title>

    <link rel="stylesheet" href="../css/style.css" type="text/css">
</head>

<body>
<div class="fixed-navbar">
    <div class="pull-left">
        <h1 class="page-title">Demo List</h1>
    </div>
</div>

<div class="table-responsive clearfix">
    <div class="main-content">
        <div class="box-content">
            <table class="table table-hover">
                <tbody>
                <tr>
                    <th scope="col">��ȣ</th>
                    <th scope="col">����</th>
                    <th scope="col">�ۼ���</th>
                    <th scope="col">��ȸ ��</th>
                    <th scope="col" style="width: 20%">�����</th>
                </tr>
                <c:forEach var="i" items="${demolist}" begin="0" step="1">
                    <tr>
                        <td>
                            <c:choose>
                                <c:when test="${i.noticeYn eq 'Y'}">����</c:when>
                                <c:when test="${i.noticeYn eq 'N'}">${i.idx}</c:when>
                            </c:choose>
                        </td>
                        <td> <a href="view.do?idx=${i.idx}">${i.title}</a></td>
                        <td>${i.writer}</td>
                        <td>${i.viewCnt}</td>
                        <td>${i.insertTime}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="btn_wrap text-right">
            <a href="/Regis.do" class="btn btn-primary waves-effect waves-light">���</a>
        </div>
    </div>
</div>
</body>
</html>
