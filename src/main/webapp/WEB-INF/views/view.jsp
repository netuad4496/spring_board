<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>상세보기</title>
    <link rel="stylesheet" href="../css/style.css" type="text/css">
</head>
<body>

<div class="table-responsive clearfix">
    <div class="main-content">

        <div class="card-content">
            <form class="form-horizontal form-view">
                <div class="form-group">
                    <label class="col-sm-2 control-label">제목</label>
                    <div class="col-sm-10">
                        <p class="form-control">${demo.title}</p>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">내용</label>
                    <div class="col-sm-10">
                        <p class="form-control">${demo.content}</p>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">작성자</label>
                    <div class="col-sm-10">
                        <p class="form-control">${demo.writer}</p>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">조회 수</label>
                    <div class="col-sm-10">
                        <p class="form-control">${demo.viewCnt}</p>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">등록일</label>
                    <div class="col-sm-10">
                        <p class="form-control">${demo.insertTime}</p>
                    </div>
                </div>

                <a href="index.do">뒤로가기</a>
            </form>
        </div>

    </div>
</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
</html>
