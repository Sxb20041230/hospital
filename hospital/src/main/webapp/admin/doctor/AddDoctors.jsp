<%--
  Created by IntelliJ IDEA.
  User: dell998
  Date: 2024/7/9
  Time: 下午8:30
  To change this template use File | Settings | File Templates.
--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加医生</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/doctor.css"> <!-- 引入样式表 -->
    <script src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
</head>
<body>
<div class="container">
    <h2>添加医生信息</h2>
    <form method="post" action="<%=request.getContextPath()%>/backend/addDoctorServlet">


        <div class="form-group">
            <label >工号:</label>
            <input type="text"readonly id="workid" name="jobNumber" value="${jobNumber}" />
        </div>

        <div class="form-group">
            <label for="name">姓名:</label>
            <input type="text" id="name" name="name" />
        </div>



        <div class="form-group">
            <label>科室名称:</label>
            <select id="rootDepartment" name="department" >
                <option value="0">请选择一级科室</option>
                <!-- 动态加载科室选项 -->
                <c:forEach items="${rootDepartmentList}" var="d">
                    <option value="${d.department_Id}">
                        ${d.department_name}
                    </option>

                </c:forEach>
                <!-- 其他科室选项 -->
            </select>
        </div>

        <div class="form-group">
            <label >科室名称:</label>
            <select id="department" name="departmentId" >
                <option value="">请选择二级科室</option>




            </select>
        </div>


        <div class="form-group">
            <label >职称:</label>
            <select  name="professionaltitle" required>
                <c:forEach items="${professionalTitleList}" var="p">
                    <option value="${p.professionalTitleId}">${p.professionalTitleName}
                    </option>

                </c:forEach>

            </select>
        </div>
        <div class="form-group" >
            <button type="submit" >提交</button>
        </div>
    </form>
</div>
</body>

<script>
    $(function(){
        $("#rootDepartment").change(function(){
        var rootId=$(this).val();
        if(rootId!=0){
            //获取到二级科室下拉列表框
            //执行一个异步请求
            var departmentObj=$("#department");
            var url="${root}/backend/loadTwoDepartmentServlet?rootId="+rootId;
            $.get(url,function(r){
            //创建一个变量对响应数据做遍历
                var optionHtml=""
                for (var i=0; i<r.length;i++)
                {
                    optionHtml+="<option value='"+r[i].department_Id+"'>"+r[i].department_name+"</option>"

                }
                departmentObj.html(optionHtml)
            },'json')
            //执行异步加载
        }
        else {
            return
        }



        })


    })


</script>



</html>
