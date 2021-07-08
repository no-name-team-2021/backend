package cn.edu.whu.shopping.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.DispatcherServlet;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author LiuWeiFan
 * @create 2021/7/8 14:50
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableCaching
@ServletComponentScan(basePackages = {"cn.edu.whu.shopping.identity"})
@EnableTransactionManagement
@MapperScan(basePackages = {"cn.edu.whu.shopping.user.dao"})
@EnableSwagger2
public class AppStarter {
    public AppStarter() {
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(AppStarter.class, args);
        DispatcherServlet dispatcherServlet = applicationContext.getBean(DispatcherServlet.class);
    }
}
