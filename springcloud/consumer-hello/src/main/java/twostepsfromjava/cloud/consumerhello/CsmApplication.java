package twostepsfromjava.cloud.consumerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient  //Eureka客户端，同时也可以获取到Eureka服务器中所注册的服务列表
@SpringBootApplication
public class CsmApplication
{
    @Bean
    @LoadBalanced   //此注解让RestTemplate启用客户端负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main( String[] args )
    {
        System.out.println( "启动服务消费类......" );
        SpringApplication.run(CsmApplication.class, args);
    }
}
