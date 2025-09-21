package io.github.saifulislamniloy.springlab.vault.hashicorp.dynamic_secret_management.service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Service1Application  implements CommandLineRunner {
    @Value("${url:__missing__}") String url;
    @Value("${SPRING_POSTGRES_HOST:__missing__}") String host;
    @Value("${SPRING_POSTGRES_PORT:__missing__}") String port;
    @Value("${SPRING_POSTGRES_DB:__missing__}")   String db;

    @Value("${spring.datasource.username:__missing__}")
    private String user;

    @Value("${spring.datasource.password:__missing__}")
    private String pw;

    public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}


    @Override
    public void run(String... args) {
        System.out.println("=== Vault values ===");
        System.out.println("URL=" + url);
        System.out.println("HOST=" + host);
        System.out.println("PORT=" + port);
        System.out.println("DB=" + db);
        System.out.println("USER=" + user);
        System.out.println("PW=" + pw);
        System.out.println("====================");
    }
}
