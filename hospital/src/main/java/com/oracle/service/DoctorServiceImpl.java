package com.oracle.service;

import com.oracle.mapper.DoctorMapper;
import com.oracle.utils.DBUtils;
import org.apache.ibatis.session.SqlSession;

public class DoctorServiceImpl implements DoctorService {


    @Override
    public Integer getCurrentMaxNumber() {
       SqlSession sqlSession= DBUtils.createDbUtils().getSQLSession();
       DoctorMapper doctorMapper = sqlSession.getMapper(DoctorMapper.class);
       String s = doctorMapper.selectMaxNumber();
       sqlSession.close();
       return Integer.parseInt(s);
    }
}
