<%-- 
    Document   : userlogin
    Created on : Apr 26, 2013, 12:12:26 AM
    Author     : è�����
--%>

<%@ page contentType="text/html; charset=gbk" %>
<html>
    <head>
        <title>��½ҳ��</title>
        
        
        <script type="javascript">
            function check(){
			var uname = document.all.uname.value;
			var upwd = document.all.upwd.value;
			if(userName.trim()==""){
				alert("�û���Ϊ��,����������!!!");
				return;
			}
			if(userPwd.trim()==""){
				alert("����Ϊ��,����������!!!");
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
                    <td>�û�����</td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>��&nbsp;�룺</td>
                    <td><input type="password" name="userPwd"/></td>
                </tr>
                <tr>
                    <td>��֤�룺</td>
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
