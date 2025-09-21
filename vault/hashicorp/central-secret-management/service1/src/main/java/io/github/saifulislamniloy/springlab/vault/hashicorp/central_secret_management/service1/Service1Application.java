package io.github.saifulislamniloy.springlab.vault.hashicorp.central_secret_management.service1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class Service1Application implements CommandLineRunner {
    @Value("${SPRING_POSTGRES_HOST:__missing__}") String host;
    @Value("${SPRING_POSTGRES_PORT:__missing__}") String port;
    @Value("${SPRING_POSTGRES_DB:__missing__}")   String db;
    @Value("${SPRING_POSTGRES_USERS:__missing__}") String user;
    @Value("${SPRING_POSTGRES_PASSWORD:__missing__}") String pw;

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

    @Override
    public void run(String... args) {
        System.out.println("=== Vault values ===");
        System.out.println("HOST=" + host);
        System.out.println("PORT=" + port);
        System.out.println("DB=" + db);
        System.out.println("USER=" + user);
        System.out.println("PW.len=" + (pw == null ? 0 : pw.length()));
        System.out.println("====================");
    }

}
