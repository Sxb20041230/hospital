package com.oracle.service;

import com.github.pagehelper.PageInfo;
import com.oracle.pojo.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findRootDepartmentList();

    void addDepartment(Department department);
    PageInfo<Department> list(Integer pageNum, Integer pageSize);

    void deleteDepartment(Integer departmentId);
        List<Department> findDepartmentByPid(Integer pid);
    Integer selectCountFromTow(Integer departmentId);
}
