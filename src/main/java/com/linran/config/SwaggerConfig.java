package com.linran.config;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

  @Value("${swagger.title}")
  private String title;

  @Value("${swagger.name}")
  private String name;

  @Value("${swagger.url}")
  private String url;

  @Value("${swagger.email}")
  private String email;

  @Bean
  public Docket docket() {
    return new Docket(DocumentationType.OAS_30)
      .groupName("测试")
      .apiInfo(apiInfo())
      // 是否开启swagger
      .enable(true)
      .select()
      // 过滤条件，扫描指定路径下的文件
      .apis(RequestHandlerSelectors.basePackage("com.linran.controller"))
      // 指定过滤路径处理，PathSelectors.any()代表不过滤任何路径
      //.paths(PathSelectors.any())
      .build();
  }

  // 配置swagger信息：通过覆盖默认的apiInfo
  private ApiInfo apiInfo() {
    // 配置作者的信息
    Contact contact = new Contact(
      name,
      "https://github.com/LinXiuci",
      "1876788496@qq.com"
    );
    return new ApiInfoBuilder()
      .title(title)
      .description("愿煦日的和风护卫着可爱的你，愿你带着满满的春笑回来。")
      .version("v3.0")
      .contact(contact)
      .license("Apache 2.0")
      .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
      .build();
  }
}
