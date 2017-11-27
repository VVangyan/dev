package twostepsfromjava.cloud.servicehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SHApplication
{
    public static void main( String[] args )
    {
        System.out.println( "服务开始启动......" );
        SpringApplication.run(SHApplication.class, args);
    }
}
