package cn.ideal.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApplicationContextConfig
 * @Author: BWH_Steven
 * @Date: 2021/5/1 23:18
 * @Version: 1.0
 */
@Configuration
// 配置负载均衡算法类，如果需要自定义算法，则需要实现ReactorServiceInstanceLoadBalancer接口
@LoadBalancerClient(name = "CLOUD-PAYMENT-SERVICE", configuration = CustomLoadBalancerConfiguration.class)
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}