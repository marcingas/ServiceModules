package test.impl;

import test.spi.TestService;

import java.util.Random;

public class TestProviderFactory {
    public static TestService provider(){
        System.out.println("TestProviderFactory provider method being executed");
        int choice = new Random().nextInt(2);
        if(choice==1) return new TestProvider();
        return new TestProviderTwo();
    }
}
