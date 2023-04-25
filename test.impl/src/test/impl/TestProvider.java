package test.impl;

public class TestProvider implements test.spi.TestService{
    @Override
    public void provideTheService() {
        System.out.println("TestProvider");
    }
}
