<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>등록입니다.</title>
    <link rel="stylesheet" href="../css/style.css" type="text/css">
</head>
<body>
<div class="fixed-navbar">
    <div class="pull-left">
        <h1 class="page-title">Demo write</h1>
    </div>
</div>

<div class="table-responsive clearfix">
    <div class="main-content">

        <form action="RegisApi" name="ListupForm" method="post">
            <input type="hidden"
            <c:if test="${demo.idx != null}"> </c:if> name="idx" value="${demo.idx}">

            <div class="form-group">
                <div class="col-sm-10" style="margin-top: 10px;">
                    <p class="col-sm-2">제목 <input type="text" name="title" value="${demo.title}"/></p>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-10" style="margin-top: 10px;">
                    <p class="col-sm-2">내용 <input type="text" name="content" value="${demo.content}"/></p>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-10" style="margin-top: 10px;">
                    <p class="col-sm-2">작성자 <input type="text" name="writer" value="${demo.writer}"/></p>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-10" style="margin-top: 10px;">
                    <p class="col-sm-2">공지글 여부 <input type="checkbox" name="noticeYn" value="Y" <c:if
                            test="${demo.noticeYn eq 'Y'}"> checked </c:if> /></p>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-10" style="margin-top: 10px;">
                    <p class="col-sm-2">비밀글 여부 <input type="checkbox" name="secretYn" value="Y" <c:if
                            test="${demo.secretYn eq 'Y'}"> checked </c:if> /></p>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-10" style="margin-top: 10px;">
                    <a href="index.do" class="btn btn-default waves-effect waves-light">뒤로가기</a>
                    <input type="submit" class="btn btn-default waves-effect waves-light" value="저장"/>
                </div>
            </div>
        </form>
    </div>
</div>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
</html>
