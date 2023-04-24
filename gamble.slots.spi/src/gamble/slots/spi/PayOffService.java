package gamble.slots.spi;

public interface PayOffService {
    // Enum representing slot machine images
    enum SlotType {
        FRUIT, JACKPOT, GOLDBAR_ONE, GOLDBAR_TWO, GOLDBAR_THREE;
    }

    // Methods which describe different types of payoffs.
    public void hitTheJackPot();

    public void threeInRow(SlotType s);

    public void twoInRow(SlotType s);
}
