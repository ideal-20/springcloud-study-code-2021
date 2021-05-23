package cn.ideal.springcloud; /**
 * @ClassName: cn.ideal.springcloud.ConfigClientMain3355
 * @Author: BWH_Steven
 * @Date: 2021/5/21 14:48
 * @Version: 1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }
}

