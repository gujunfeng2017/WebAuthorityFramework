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
    <script>
        function test(){
            var DataT = $("kouLing").val();
            $.ajax({
                type : "POST",  //提交方式
                dataType: 'json',
                url : "<%=request.getContextPath() %>/testRelay/data",//路径
                data : '{"data1":DataT}',//数据，这里使用的是Json格式进行传输
                success : function(Data){//返回数据根据结果进行相应的处理
                     DataT = Data.result;
                        alert(DataT);
                }
            });
        }
    </script>
    <title>此处不应有乱码</title>
</head>
<body>
    <h1>This is a Jsp</h1>
<h1>此处不应有乱码？</h1>
    <div>
        <from action="<%=request.getContextPath()%>/testRelay/data" method="POST" id="formid">
    <table    border="1" >
        <tbody>
        <tr>
            <td>口令</td>
            <td><input type="text" name="kouLing" id="kouLing"></td>
        </tr>
        <tr>
            <td>密钥</td>
            <td><input type="password" name="password"></td>
        </tr>
        </tbody>
        <tr>
            <td><input type="button" value="条件" onclick="test()" /></td>
        </tr>
    </table>
        </from>
    </div>
    <div style="margin-top:50px;padding-top: 50px;margin-left: 200px;padding-left: 200px"><img src="<%=request.getContextPath()%>/pictures/timg.jpg" /></div>
</body>
</html>
