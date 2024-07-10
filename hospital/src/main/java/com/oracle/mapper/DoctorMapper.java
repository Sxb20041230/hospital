package com.oracle.mapper;

import org.apache.ibatis.annotations.Select;

public interface DoctorMapper {
    @Select("select max(job_number) from doctors")
    String selectMaxNumber();
}
