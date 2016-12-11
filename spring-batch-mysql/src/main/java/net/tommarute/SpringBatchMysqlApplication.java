package net.tommarute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchMysqlApplication {

    public static void main(String[] args) {
        System.exit(SpringApplication
                .exit(SpringApplication.run(BatchConfiguration.class, args)));
    }
}
