package njvirtual.slots.impl;

import gamble.slots.spi.PayOffService;

// This provider implements the PayOffService with different prizes
public class ACPayOffService implements PayOffService {

    // This class has a public no args constructor, and does
    // not declare a static provider method.
    public ACPayOffService() {
        System.out.println("Atlantic City PayOffService loaded");
    }

    public void hitTheJackPot() {
        System.out.println("Voucher for free week at Caeser's");
    }

    public void threeInRow(SlotType s) {
        System.out.println("Voucher for Free Show at Atlantis");
    }

    public void twoInRow(SlotType s) {
        System.out.println("Voucher for 50 Trump tokens");
    }
}