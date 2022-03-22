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
<div class="fixed-navbar">
    <div class="pull-left">
        <h1 class="page-title">Demo Detail</h1>
    </div>
</div>

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
            </form>
            <div class="btn_wrap text-center">
                <a href="index.do" class="btn btn-default waves-effect waves-light">뒤로가기</a>
                <input type="button" onclick="deleteDemo(${demo.idx});" class="btn btn-danger waves-effect waves-light" value="삭제하기"></input>
                <a href="Regis.do?idx=${demo.idx}" class="btn btn-primary waves-effect waves-light">수정하기</a>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    function deleteDemo(idx) {
        console.log(idx);

        if(confirm("정말 삭제하겠습니까?")) {

            let form = document.createElement('form');
            form.action = 'deleteDemo';
            form.method = 'POST';
            form.innerHTML = '<input name="idx" value="' + idx + '">';

            document.body.append(form);

            form.submit();
        } else {
            return;
        }

    }

</script>
</html>
