<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<%--
  Created by IntelliJ IDEA.
  User: tnguyen
  Date: 10/26/2024
  Time: 3:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../static/delete1.css">
</head>
<body>
    <div class="header">
        <div class="p-3 mb-2 bg-warning text-dark">
            <h1>Xác nhận xóa!!!!</h1>
        </div>
    </div>
    <div class="main">
        <div class="left"></div>

        <div class="mid">
            <div class="midtop">
                <p class="fs-3 fw-semibold" style="color: red">
                    Bạn có chắc chắn xóa khỏi dữ liệu căn hộ có mã: ${deleteId}
                </p>




            </div>

            <div class="midmid">
                <form action="http://localhost:8080/delete?state=yes" method="post">
                    <input type="hidden"name="deleteId" value="${deleteId}">
                    <button type="submit" class="btn btn-danger">Chắc chắn</button>
                </form>

                <a href="http://localhost:8080/home">
                    <button type="button" class="btn btn-primary">Về trang chủ</button>
                </a>


            </div>

            <div class="midbot"></div>




        </div>
        <div class="right"></div> 
    </div>

</body>
</html>
