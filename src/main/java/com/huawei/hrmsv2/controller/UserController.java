package com.huawei.hrmsv2.controller;

import com.huawei.hrmsv2.facade.request.user.LoginReq;
import com.huawei.hrmsv2.facade.response.BaseResponse;
import com.huawei.hrmsv2.facade.response.user.LoginResp;
import com.huawei.hrmsv2.facade.response.user.UserListResp;
import com.huawei.hrmsv2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public BaseResponse<LoginResp> login(LoginReq request) {
        BaseResponse<LoginResp> response = userService.login(request);
        return response;
    }

    @GetMapping("/userlist")
    @ResponseBody
    public BaseResponse<UserListResp> getUserList() {
        BaseResponse<UserListResp> response = userService.getUserList();
        return response;
    }

}
