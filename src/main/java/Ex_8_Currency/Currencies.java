package Ex_8_Currency;

/**
 * Created by paul on 25.06.17.
 */
public enum Currencies {
    USD(4.00),
    EUR(4.20),
    PLN(1),
    UAH(0.55),
    GPB(5.6);

    private double rate;


    Currencies(double rate) {
        this.rate=rate;
    }

    public double getRate() {
        return rate;
    }
}
