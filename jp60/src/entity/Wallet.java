package entity;

/** Stores the money available in a user's wallet. */
public class Wallet {

    private final int amount;

    public Wallet(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    /** Returns the sum of all bills. */
    public int calcTotal(int[] bills) {
        int total = 0;
        for (int bill : bills) {
            total += bill;
        }
        return total;
    }

    /** Returns whether this wallet can cover the given total. */
    public boolean payMoney(int total) {
        return amount >= total;
    }
}
