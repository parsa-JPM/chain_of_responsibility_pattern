/**
 * It will store the amount to dispense and used by the chain implementations.
 *
 * Currency.java
 */
public class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
