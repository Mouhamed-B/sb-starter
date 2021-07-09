package com.mdbm.sbstarter.service;
import com.mdbm.sbstarter.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public  BusinessService(){

    }

    public HelloWorld getHelloWorld(){
        return new HelloWorld();
    }
}
