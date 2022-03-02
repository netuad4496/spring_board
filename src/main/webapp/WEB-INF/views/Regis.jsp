<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>등록입니다.</title>
</head>
<body>

<form action="RegisApi" name="ListupForm" method="post">
    <p>제목 <input type="text" name="title" /></p>
    <p>내용 <input type="text" name="content" /></p>
    <p>작성자 <input type="text" name="writer" /></p>
    <p>공지글 여부 <input type="checkbox" name="noticeYn" value="Y" /></p>
    <p>비밀글 여부 <input type="checkbox" name="secretYn" value="Y" /></p>
    <input type="submit" value="등록" />
</form>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
</html>
