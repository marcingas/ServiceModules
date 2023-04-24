package gamble.slots.impl;

// This class implements the PayOffService
public class PayOffServiceImpl implements PayOffService {

    // This is a static provider method, one of the two ways to
    // configure a Provider
    public static PayOffService provider() {
        System.out.println("PayOffServiceImpl is getting loaded" +
                " by provider method");
        return new PayOffServiceImpl();
    }

    // Provide implementations of the PayOffService's methods
    public void hitTheJackPot() {
        System.out.println("Whoo Hoo!  Quit your job baby.");
    }

    public void threeInRow(SlotType s) {
        System.out.println("Dinner is on the house");
    }

    public void twoInRow(SlotType s) {
        System.out.println("10 Credits to keep betting");
    }
}