<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    int dan = Integer.parseInt(request.getParameter("dan"));
    int limit = Integer.parseInt(request.getParameter("limit"));
%>

<h1><%=dan%>단</h1>

<% for ( int i = 1; i <= limit; i++ ) { %>
<div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>
<!-- 방식 1 -->
<% System.out.print("<h1>정말일까?</h1>"); %>
<!-- 방식 2 -->
<%="<h1>정말일까?</h1>"%>
<!-- 방식 3 -->
<h1>정말일까?</h1>
