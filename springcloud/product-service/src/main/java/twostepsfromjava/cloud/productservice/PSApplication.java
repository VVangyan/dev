package twostepsfromjava.cloud.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PSApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Product-Service 服务启动......" );
        SpringApplication.run(PSApplication.class, args);
    }
}
