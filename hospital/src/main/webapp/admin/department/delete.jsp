<%--
  Created by IntelliJ IDEA.
  User: 15221
  Date: 2024/7/9
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>确认删除</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        .message {
            font-size: 18px;
            margin-bottom: 20px;
        }
        .button {
            background-color: #007bff;
            color: #ffffff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            margin: 5px;
            transition: background-color 0.3s ease;
        }
        .button:hover {
            background-color: #0056b3;
        }
        .cancel {
            background-color: #6c757d;
        }
        .cancel:hover {
            background-color: #5a6268;
        }
    </style>
    <script type="text/javascript">
        function confirmDelete() {
            var id = "<%= request.getAttribute("id") %>";
            var result = confirm("确认删除该科室吗？");
            if (result) {
                // 用户点击"确定"，提交删除表单
                document.getElementById("deleteForm").submit();
            } else {
                // 用户点击"取消"，重定向到原页面
                window.location.href = "<%=request.getContextPath()%>/backend/rootDepartmentServlet";
            }
        }
    </script>
</head>
<body onload="confirmDelete()">
<div class="container">
    <p class="message">正在处理删除操作，请稍候...</p>
</div>
<form id="deleteForm" action="<%= request.getContextPath() %>/backend/deleteServlet" method="post">
    <input type="hidden" name="id" value="<%= request.getAttribute("id") %>" />
</form>
</body>
</html>
