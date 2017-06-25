package Ex_8_Currency;


import org.junit.Assert.*;
import org.junit.Test;

import static Ex_8_Currency.Currencies.GPB;
import static Ex_8_Currency.Currencies.PLN;
import static Ex_8_Currency.Currencies.USD;


/**
 * Created by paul on 25.06.17.
 */
public class test {

    @Test
    public void testCurrency() {
        Money money = new Money();
        double amount = money.currencyCalculator(1, GPB.getRate(), USD.getRate());
        System.out.println(amount);
    }
}
