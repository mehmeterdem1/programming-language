package kodlama.io.Devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class kodlamaIoDevsApplication {

    public static void main(String[] args) {
        SpringApplication.run(kodlamaIoDevsApplication.class, args);
    }

}