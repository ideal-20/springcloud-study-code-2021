package cn.ideal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @ClassName: cn.ideal.springcloud.ConfigClientMain3366
 * @Author: BWH_Steven
 * @Date: 2021/5/24 08:30
 * @Version: 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class, args);
    }
}


