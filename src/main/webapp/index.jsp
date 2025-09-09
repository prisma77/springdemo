<%@ page contentType="text/html; charset=UTF-8" %>
<%
  //response.sendRedirect() 요청하는 것 자체가 service
  //request.getContextPath() root 경로를 반환
  response.sendRedirect(request.getContextPath() + "/home");
%>

