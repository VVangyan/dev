package twostepsfromjava.cloud.servicedir;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Application
{
    public static void main( String[] args )
    {
        System.out.println( "Eureka Server 启动......" );
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
