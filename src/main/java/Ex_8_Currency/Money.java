package Ex_8_Currency;

/**
 * Created by paul on 25.06.17.
 */
public class Money {
    private String Currency;

    public double currencyCalculator(double amount, double from, double to){
        double finalValue;
        finalValue = amount*from/to;
        return finalValue;
    }
}
