package com.oracle.mapper;

import com.github.pagehelper.PageInfo;
import com.oracle.pojo.Department;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepartmentMapper {
    List<Department> selectRootDepartment();
    void insertDepartment(Department department);
    List<Department> selectDepartmentAll();
    void deleteDepartment(int departmentId);

    Integer selectCountFromTow(Integer pid);
    @Select("select department_id as department_Id,department_name as department_name from departments where department_pid=#{pid}")
    List<Department> selectDepartmentByPid(Integer pid);


}
