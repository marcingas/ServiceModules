package test.impl;

public class TestProviderTwo implements test.spi.TestService{
    public TestProviderTwo() {
        System.out.println("TestProviderTwo constructor");
    }

    @Override
    public void provideTheService() {
        System.out.println("TestProviderTwo");
    }
}
