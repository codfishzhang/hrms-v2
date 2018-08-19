package com.huawei.hrmsv2.data.dao;

import com.huawei.hrmsv2.data.model.SysUserResumeType;
import com.huawei.hrmsv2.data.model.SysUserResumeTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysUserResumeTypeMapper {
    long countByExample(SysUserResumeTypeExample example);

    int deleteByExample(SysUserResumeTypeExample example);

    int insert(SysUserResumeType record);

    int insertSelective(SysUserResumeType record);

    List<SysUserResumeType> selectByExample(SysUserResumeTypeExample example);

    int updateByExampleSelective(@Param("record") SysUserResumeType record, @Param("example") SysUserResumeTypeExample example);

    int updateByExample(@Param("record") SysUserResumeType record, @Param("example") SysUserResumeTypeExample example);
}