package hello;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
public class MyApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(MyApplication.class, args);
		log.info("start sucess....");
//		Thread.currentThread().sleep(100000L);
	}

}
