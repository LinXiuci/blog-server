package com.linran.controller;

import com.linran.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "UserController", description = "用户控制器")
@RestController
@RequestMapping("/user")
public class UserController {



  @ApiOperation("all")
  @GetMapping("/all")
  public User user() {
    return new User();
  }

  @ApiOperation("创建账号")
  @PostMapping("/create")
  @ResponseBody
  public String createUser(
    @ApiParam(value = "账号与密码", required = true) User user
  ) {
    return "创建成功" + user;
  }
}
