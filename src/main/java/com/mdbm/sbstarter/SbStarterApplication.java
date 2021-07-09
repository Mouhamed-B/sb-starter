package com.mdbm.sbstarter;

import com.mdbm.sbstarter.model.HelloWorld;
import com.mdbm.sbstarter.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbStarterApplication implements CommandLineRunner {

    @Autowired
    private BusinessService bs;

    public static void main(String[] args) {
        SpringApplication.run(SbStarterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        HelloWorld hw = bs.getHelloWorld();
        System.out.println(hw);
    }
}
