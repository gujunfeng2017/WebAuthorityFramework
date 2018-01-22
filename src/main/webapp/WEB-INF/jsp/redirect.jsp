<%--
  Created by IntelliJ IDEA.
  User: programmer.aj
  Date: 2017/6/10
  Time: 2017年6月10日11:47:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<script  src="<%=request.getContextPath()%>/js/jquery/jquery-autocomplete/autocomplete/jquery-1.10.2.js"/>--%>
<script src="<%=request.getContextPath() %>/js/jquery/jquery-autocomplete/autocomplete/jquery-1.10.2.js"></script>
<head>
    <title>此处不应有乱码</title>
</head>
<body>
    <h1>This is a Jsp</h1>

    <form action="https://221.122.73.123/mock/bankPayment" method="POST">
        First name:<br>
        <input type="text" name="epccGwMsg" value="">
        <br>
        <br><br>
        <input type="submit" value="Submit">
    </form>

    <p>如果您点击提交，表单数据会被发送到名为 demo_form.asp 的页面。</p>

</body>
</html>
