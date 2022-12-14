package ef.danielatoche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class Ec4ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec4ConfigServerApplication.class, args);
	}

}
