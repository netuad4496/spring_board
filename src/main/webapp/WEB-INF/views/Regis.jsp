<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>����Դϴ�.</title>
</head>
<body>

<form action="RegisApi" name="ListupForm" method="post">
    <p>���� <input type="text" name="title" /></p>
    <p>���� <input type="text" name="content" /></p>
    <p>�ۼ��� <input type="text" name="writer" /></p>
    <p>������ ���� <input type="checkbox" name="noticeYn" value="Y" /></p>
    <p>��б� ���� <input type="checkbox" name="secretYn" value="Y" /></p>
    <input type="submit" value="���" />
</form>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
</html>
