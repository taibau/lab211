package entity;

/** Represents the user and the wallet they carry. */
public class Person {

    private final Wallet wallet;

    public Person(int walletAmount) {
        wallet = new Wallet(walletAmount);
    }

    public Wallet getWallet() {
        return wallet;
    }
}
