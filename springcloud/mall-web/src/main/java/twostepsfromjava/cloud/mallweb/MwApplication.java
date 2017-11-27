package twostepsfromjava.cloud.mallweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients      //注解，用来开启Feign相关功能 //@EnableFeignClients(basePackages = "io.twostepsfromjava.cloud.**")  //如果Service是单独编译一个jar包，那么在使用@EnableFeignClients注解时需要指定basePackages的值,否则，自动织入时就会报找不到ProductServicebean的错误.
@EnableDiscoveryClient
@SpringBootApplication
public class MwApplication
{
    public static void main( String[] args )
    {
        System.out.println( "MALL 消费类服务启动......" );
        SpringApplication.run(MwApplication.class, args);
    }
}
