<%-- 
    Document   : userlogin
    Created on : Apr 26, 2013, 12:12:26 AM
    Author     : 猫的鱼儿
--%>

<%@ page contentType="text/html; charset=gbk" %>
<html>
    <head>
        <title>登陆页面</title>
        
        
        <script type="javascript">
            function check(){
			var uname = document.all.uname.value;
			var upwd = document.all.upwd.value;
			if(userName.trim()==""){
				alert("用户名为空,请重新输入!!!");
				return;
			}
			if(userPwd.trim()==""){
				alert("密码为空,请重新输入!!!");
				return;
			}
			document.all.mf.submit();
		}
        </script>
    </head>
    <body>
    <center>
        <form action="ManageLogin" method="post" id="mf">
            <table>
                <tr>
                    <td>用户名：</td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>密&nbsp;码：</td>
                    <td><input type="password" name="userPwd"/></td>
                </tr>
                <tr>
                    <td>验证码：</td>
                    <td><input type="text" name="yzm" id="yzm"/></td>
                    <td><img src="Check" onclick="history(0);" /><br></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <img border="0" src="img/ddl.gif" id="lg" onclick="JavaScript:check()"
                             style="cursor:hand"
                             onmouseover="document.all.lg.src='img/ddla.gif'"
                             onmouseout="document.all.lg.src='img/ddl.gif'"
                             onmouseup="document.all.lg.src='img/ddla.gif'"        	
                             onmousedown="document.all.lg.src='img/ddlb.gif'"/>
                        <img border="0" src="img/cz.gif" id="cz" onclick="JavaScript:document.all.mf.reset()"
                             style="cursor:hand"
                             accesskey=""onmouseover="document.all.cz.src='img/cza.gif'"
                             onmouseout="document.all.cz.src='img/cz.gif'"
                             onmouseup="document.all.cz.src='img/cza.gif'"        	
                             onmousedown="document.all.cz.src='img/czb.gif'"/>
                    </td>
                    <td><input type="submit"/></td>
                </tr>  
            </table>
            <input type="hidden" name="action" value="login"/>
        </form>
    </center>
    </body>
</html>
