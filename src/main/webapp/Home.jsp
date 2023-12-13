<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.Playlist" %>
<%@page import="java.awt.event.ItemEvent" %>
<%@page import="model.bo.PlaylistBO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trang chủ</title>
    <%@include file="./all_component/allCSS.jsp" %>
    <link rel="stylesheet" href="./all_component/style.css">
</head>
<body>
<div class="page">
    <div class="category">
        <ul class="category_top">
            <li class="top_item">
                <a href="" class="top_item_lable">
                    <i class="fa-solid fa-house top_item_icon"></i>
                    Trang chủ
                </a>
            </li>
            <li class="top_item">
                <a href="" class="top_item_lable">
                    <i class="fa-solid fa-magnifying-glass top_item_icon"></i>
                    Tìm kiếm
                </a>
            </li>
        </ul>

        <div class="library">
            <div class="library_left">
                <i class="fa-solid fa-bookmark library_icon"></i>
                <p class="library_lable">Thư viện</p>
            </div>
            <a href="" class="library_add">
                <i class="fa-solid fa-plus library_icon"></i>
            </a>
        </div>
    </div>

    <div class="content">
        <jsp:include page="page/No_Login.jsp" />
    </div>
</div>
</body>
</html>