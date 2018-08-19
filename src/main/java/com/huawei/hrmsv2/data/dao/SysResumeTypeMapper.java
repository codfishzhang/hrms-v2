package com.huawei.hrmsv2.data.dao;

import com.huawei.hrmsv2.data.model.SysResumeType;
import com.huawei.hrmsv2.data.model.SysResumeTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysResumeTypeMapper {
    long countByExample(SysResumeTypeExample example);

    int deleteByExample(SysResumeTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysResumeType record);

    int insertSelective(SysResumeType record);

    List<SysResumeType> selectByExample(SysResumeTypeExample example);

    SysResumeType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysResumeType record, @Param("example") SysResumeTypeExample example);

    int updateByExample(@Param("record") SysResumeType record, @Param("example") SysResumeTypeExample example);

    int updateByPrimaryKeySelective(SysResumeType record);

    int updateByPrimaryKey(SysResumeType record);
}