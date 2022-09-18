package com.linran.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "HomeController", description = "首页控制器")
@RestController
public class HomeController {

  // 重定向到 swagger-ui/index.html
  @ApiOperation("重定向:swagger-ui/index.html")
  @GetMapping("/")
  public void index(HttpServletResponse response) throws IOException {
    response.sendRedirect("http://localhost:8080/swagger-ui/index.html");
  }
}
