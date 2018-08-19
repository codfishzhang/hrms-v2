package com.huawei.hrmsv2.service;

import com.huawei.hrmsv2.data.dao.SysUserMapper;
import com.huawei.hrmsv2.data.model.SysUser;
import com.huawei.hrmsv2.facade.request.user.LoginReq;
import com.huawei.hrmsv2.facade.response.BaseResponse;
import com.huawei.hrmsv2.facade.response.user.LoginResp;
import com.huawei.hrmsv2.facade.response.user.UserListResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    public BaseResponse<LoginResp> login(LoginReq request) {

        sysUserMapper.selectByPrimaryKey(1L);
        return null;
    }

    public BaseResponse<UserListResp> getUserList() {
        SysUser sysUser =  sysUserMapper.selectByPrimaryKey(1L);
        return null;
    }
}
