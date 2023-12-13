<%@page import="java.awt.event.ItemEvent"%>
<%@page import="model.bo.PlaylistBO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.Playlist" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Login</title>

</head>
<body>
<div class="noidung">
    <div class="header">
        <div class="header_btn_Register">
            <a class="btn_lable" href="./Home.jsp">Trang chủ</a>
        </div>
        <div class="header_btn_Login">
            <a class="btn_lable" href="./Login.jsp">Đăng nhập</a>
        </div>
    </div>
    <div class="body">
        <div class="body_lable">
            <a class="body_lable_list " href="">Danh sách phát trên Spotify</a>
            <a class="body_lable_all " href="">Hiện tất cả</a>
        </div>
        <div class="body_content">
            <%
                // Get playlist from request attribute
                ArrayList<Playlist> playlist = (ArrayList<Playlist>) request.getAttribute("playlist");
                System.out.printf("No_login: " + playlist);
                if (playlist != null) {
	

                    // Iterate through the playlist and display each item
                    for (Playlist item : playlist) {
            %>

            <div class="body_item">
                <div class="khungImg">
                    <img class="Img" alt="avatar"
                         src="<%= item.getImg() %>">
                </div>
                <div class="item_title">
                    <h4 class="item_lable"><%= item.getName() %></h4>
                    <p class="item_status"><%= item.getStatus() %></p>
                </div>
            </div>
            <%
                }
            } else {

            %>
            <h2 style="color: white">No DaTa</h2>
            <%
                }
            %>
        </div>
    </div>
    
    
</div>
</body>
</html>