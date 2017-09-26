<%@page import="com.tracuu.service.ThongtinLocalServiceUtil" %>
<%@page import="com.tracuu.model.Thongtin" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<portlet:defineObjects />
Danh sách thủ tục
<ul>
    <% Thongtin tt = ThongtinLocalServiceUtil.getThongtin(1) ;%>
    <li><%= tt.getTenthutuc() %> cccc</li>
</ul>
