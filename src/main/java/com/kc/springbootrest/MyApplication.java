package com.kc.springbootrest;

import com.kc.springbootrest.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by User on 5/8/2017.
 */

@Import(JpaConfiguration.class)
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
