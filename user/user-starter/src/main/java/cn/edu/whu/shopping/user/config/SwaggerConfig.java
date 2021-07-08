package cn.edu.whu.shopping.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author LiuWeiFan
 * @create 2021/7/8 14:51
 */
@Configuration
@ComponentScan(basePackages = {"cn.edu.whu.j2ee.identity"})
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("shopping-user")
                .description("shopping-user api document")
                .contact(new Contact("Liu Weifan", null, "1798707219@qq.com"))
                .termsOfServiceUrl(null)
                .version("0.0.1.SNAPSHOT")
                .build();
    }

}