<%--
  Created by IntelliJ IDEA.
  User: 15221
  Date: 2024/7/9
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cannot Delete</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            background-color: #f4f4f4;
        }

        .message {
            margin-bottom: 20px;
        }

        .btn {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
            text-decoration: none;
        }

        .btn:hover {
            background-color: #0056b3;
        }

        .footer {
            margin-top: auto;
            padding: 20px;
        }
    </style>
    <script type="text/javascript">
        function goBack() {
            window.history.back();
        }

        window.onload = function() {
            var count = <%= request.getAttribute("count") %>;
            if (count > 0) {
                alert("该科室不能删除。");
            }
        };
    </script>
</head>
<body>
<div class="message">
    <h1>该科室不能删除。</h1>
</div>
<div class="footer">
    <button class="btn" onclick="goBack()">返回上一页</button>
</div>
</body>
</html>
