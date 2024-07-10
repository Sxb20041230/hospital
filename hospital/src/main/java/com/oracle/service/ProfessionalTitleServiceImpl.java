package com.oracle.service;

import com.oracle.mapper.ProfessionalMapper;
import com.oracle.pojo.ProfessionalTitles;
import com.oracle.utils.DBUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ProfessionalTitleServiceImpl implements  ProfessionalTitleService{


    @Override
    public List<ProfessionalTitles> getProfessionalTitle() {
        SqlSession sqlSession = DBUtils.createDbUtils().getSQLSession();
        ProfessionalMapper professionalMapper = sqlSession.getMapper(ProfessionalMapper.class);
        List<ProfessionalTitles> professionalTitlesList =professionalMapper.selectProfessionalTitleAll();
        sqlSession.close();
        return professionalTitlesList;
    }
}
