package gamble.slots.game;

import gamble.slots.spi.PayOffService;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class CherrySlot {
    public static void main(String[] args) {
        // Mock playing the game.
        new CherrySlot().playGame();

    }

    // Method searches for providers, returns last one loaded if any
    // have been loaded.  forEach implicitly uses iterator on ServiceLoader
    private PayOffService getService() {
        List<PayOffService> providers = new ArrayList<>();
        ServiceLoader.load(PayOffService.class).forEach(providers::add);
        if (providers.size() > 0) {
            return providers.get(providers.size() - 1);
        }
        return null;
    }

    // Method that plays the game and provides winnings
    private void playGame() {

        PayOffService p = getService();
        if (p == null) System.out.println("Provider not found");
        else {
            System.out.println("Congratulations:  You're a winner!");
            p.threeInRow(PayOffService.SlotType.GOLDBAR_ONE);
        }

    }
}

