package by.shylau.servicescheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServiceSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSchedulerApplication.class, args);
    }

}
