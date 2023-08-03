package me.woosang.springbootpratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootPraticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootPraticeApplication.class, args);
    }
}
