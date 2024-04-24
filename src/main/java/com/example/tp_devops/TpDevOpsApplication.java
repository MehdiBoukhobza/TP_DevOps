package com.example.tp_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpDevOpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpDevOpsApplication.class, args);
        System.out.println("Une modification de la part du Testeur");
    }

}
