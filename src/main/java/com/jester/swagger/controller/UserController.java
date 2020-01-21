package com.jester.swagger.controller;

import com.jester.swagger.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserById/{id}")
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
    public User getUserById(@PathVariable Integer id) {
        User user = new User();
        user.setUsername("jester");
        user.setAddress("广东省深圳市");
        user.setId(id);
        return user;
    }
    @PutMapping("/updateUserByI")
    @ApiOperation("根据id更新用户的接口")
    public User updateUserById(@RequestBody @Valid User user) {
        return user;
    }
}