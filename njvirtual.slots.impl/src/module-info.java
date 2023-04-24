module njvirtual.slots.impl {
    requires gamble.slots.spi;
    provides gamble.slots.spi.PayOffService
            with njvirtual.slots.impl.ACPayOffService;
}