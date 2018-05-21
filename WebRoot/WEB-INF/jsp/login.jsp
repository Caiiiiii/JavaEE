<%--
  Created by IntelliJ IDEA.
  User: 17867
  Date: 2018/4/17
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>

        ${msg}
            <form action="/login" method="post">
                用户名：<input type="text" name="username" /><br />
                密码：<input type="password" name="password" /><br />
                手机号：<input type="text" name="phone" /><br />
                <input type="submit" value="登录" />
            </form>

</body>
</html>
