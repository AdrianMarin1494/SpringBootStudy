package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student adrian = new Student(
              "Adrian",
              "adrian@gmail.com",
                    LocalDate.of(1994, Month.APRIL, 1),
              29
            );
            Student tim = new Student(
                    "Tim",
                    "tim@gmail.com",
                    LocalDate.of(1994, Month.APRIL, 1),
                    29
            );

            repository.saveAll(
                    List.of(adrian, tim)
            );
        };
    }
}
