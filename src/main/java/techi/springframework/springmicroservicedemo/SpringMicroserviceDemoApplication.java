package techi.springframework.springmicroservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
public class SpringMicroserviceDemoApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(SpringMicroserviceDemoApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "6084"));
        app.run(args);

        //SpringApplication.run(MsscBreweryApplication.class, args);
    }

}
