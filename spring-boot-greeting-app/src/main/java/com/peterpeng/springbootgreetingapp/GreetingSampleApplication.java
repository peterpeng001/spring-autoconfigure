package com.peterpeng.springbootgreetingapp;

import com.peterpeng.Greeter;
import com.peterpeng.GreetingConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.peterpeng.GreeterConfigParams.*;

@SpringBootApplication
public class GreetingSampleApplication implements CommandLineRunner {

    @Autowired
    private Greeter greeter;

    public static void main(String[] args) {
        SpringApplication.run(GreetingSampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String message = greeter.greet();
        System.out.println(message);
    }

    @Bean
    public GreetingConfig greeterConfig() {

        String userName = "Youyou";
        String morningMessage = "morning";
        String afternoonMessage = "afternoon";
        String eveningMessage = "evening";
        String nightMessage = "night";

        GreetingConfig greetingConfig = new GreetingConfig();
        greetingConfig.put(USER_NAME, userName);
        greetingConfig.put(MORNING_MESSAGE, morningMessage);
        greetingConfig.put(AFTERNOON_MESSAGE, afternoonMessage);
        greetingConfig.put(EVENING_MESSAGE, eveningMessage);
        greetingConfig.put(NIGHT_MESSAGE, nightMessage);
        return greetingConfig;
    }
}
