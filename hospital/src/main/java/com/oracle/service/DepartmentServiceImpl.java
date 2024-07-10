package com.oracle.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.mapper.DepartmentMapper;
import com.oracle.pojo.Department;
import com.oracle.utils.DBUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Collections;
import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {


    @Override
    public List<Department> findRootDepartmentList() {
        SqlSession sqlSession = DBUtils.createDbUtils().getSQLSession();
        DepartmentMapper departmentMapper= sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departmentList =departmentMapper.selectRootDepartment();
        sqlSession.close();
        return departmentList;
    }

    @Override
    public void  addDepartment(Department department) {
        SqlSession sqlSession = DBUtils.createDbUtils().getSQLSession();
        DepartmentMapper departmentMapper= sqlSession.getMapper(DepartmentMapper.class);
        departmentMapper.insertDepartment(department);
        sqlSession.commit();//事物提交 ma
        sqlSession.close();
    }

    @Override
    public void deleteDepartment(Integer departmentId){
        SqlSession sqlSession = DBUtils.createDbUtils().getSQLSession();
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        departmentMapper.deleteDepartment(departmentId);
        sqlSession.commit(true);
        sqlSession.close();
    }

    @Override
    public List<Department> findDepartmentByPid(Integer pid) {
        SqlSession sqlSession = DBUtils.createDbUtils().getSQLSession();
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departmentList =departmentMapper.selectDepartmentByPid(pid);
        sqlSession.close();

        return departmentList;
    }

    @Override
    public Integer selectCountFromTow(Integer departmentId){
        SqlSession sqlSession = DBUtils.createDbUtils().getSQLSession();
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Integer count = departmentMapper.selectCountFromTow(departmentId);
        sqlSession.close();
        return count;
    }
    @Override
    public PageInfo<Department> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SqlSession sqlSession = DBUtils.createDbUtils().getSQLSession();
        DepartmentMapper departmentMapper= sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departmentList =departmentMapper.selectDepartmentAll();

        return new PageInfo<Department>(departmentList);


    }
}

