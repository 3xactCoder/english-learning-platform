package com.example.englishplatform;

import org.springframework.boot.SpringApplication;

public class TestEnglishLearningPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.from(EnglishLearningPlatformApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
