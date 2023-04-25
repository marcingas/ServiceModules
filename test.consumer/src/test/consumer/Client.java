package test.consumer;

import test.spi.TestService;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Client {
    public static void main(String[] args) {
        List<TestService> providers = new ArrayList<>();
        ServiceLoader.load(TestService.class).forEach(providers::add);

        TestService serviceImpl = null;
        if(providers.size()>0){
        System.out.println("Found " + providers.size() + "providers");
        providers.stream().forEach(System.out::println);
        serviceImpl = providers.get(providers.size() - 1);
        serviceImpl.provideTheService();
        }else{
            System.out.println("No provider provided");
        }
    }
}
