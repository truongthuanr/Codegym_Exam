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
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../static/home1.css">
</head>
<body>
<div class="header"></div>
<div class="main">
    <div class="left"></div>

    <div class="mid">
        <form action="http://localhost:8080/delete?state=confirm" class="form" method="post">


            <div class="midtop">
                <div class="addbutton">
                    <a href="http://localhost:8080/add">
                        <button type="button" class="btn btn-success">Thêm mới</button>
                    </a>

                </div>

            </div>

            <div class="midmid">
                <table class="table table-striped table-hover">
                    <tr>
                        <td>STT</td>
                        <td>Mã phòng trọ</td>
                        <td>Tên người thuê</td>
                        <td>Số điện thoại</td>
                        <td>Ngày bắt đầu thuê</td>
                        <td>Hình thức thanh toán</td>
                        <td>Ghi chú</td>
                        <td>Chọn</td>
                    </tr>
                    <c:forEach var="item" items="${apartments}">
                        <tr>
                            <td></td>
                            <td>${item.id}</td>
                            <td>${item.name}</td>
                            <td>${item.tel}</td>
                            <td>${item.startdate}</td>
                            <td>${item.paytype}</td>
                            <td>${item.note}</td>
                            <td><input type="checkbox" name="isdelete" id="" value="${item.id}"></td>

                        </tr>


                    </c:forEach>
                </table>
            </div>

            <div class="midbot">
                <div class="deletebutton">

                        <button type="submit" class="btn btn-danger">Xóa</button>

                </div>


            </div>


        </form>
    </div>
    <div class="right"></div>
</div>

</body>
</html>
