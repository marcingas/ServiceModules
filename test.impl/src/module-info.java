module test.impl {
    requires test.spi;
    provides test.spi.TestService with
            //test.impl.TestProvider,
    //test.impl.TestProviderTwo,
            test.impl.TestProviderFactory;
}