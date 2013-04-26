<%-- 
    Document   : error
    Created on : Apr 26, 2013, 2:37:32 AM
    Author     : 猫的鱼儿
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error</title>
        <script>
                
            function error_yzm()
            {
                alert("验证码错误");
            }
            
            function error_password()
            {
                alert("密码错误");
            }
            
            function unexistUser()
            {
                alert("用户名不存在");
            }
            </script>
    </head>
    <c:choose>
        <c:when test="${requestScope.error_type=='unexistUser'}">
            <script>
                unexistUser();
            </script>
            <a href="new_user.jsp">申请账号</a>
        </c:when>
        <c:when test="${requestScope.error_type=='error_password'}">
            <script>
                error_password();
            </script>
            <a href="new_user.jsp">申请账号</a>
        </c:when>
        <c:otherwise>
            <script>
                error_yzm();
            </script>
        </c:otherwise>
    </c:choose>
            <a href="index.jsp">返回</a>
</html>
