package Ex_6;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by paul on 25.06.17.
 */
public class RoundDecimalNumber {
    public static void main(String[] args) {
        System.out.println(" Enter a value: ");
        try{
            Scanner scan = new Scanner(System.in);
            BigDecimal numberToRound = scan.nextBigDecimal();

                System.out.println("Enter precision number: ");
                int precision = scan.nextInt();
                StringBuffer pattern= new StringBuffer("#.");
                for (int i=0; i==precision;i++){
                    pattern.append("0");
                }
                String finPattern = pattern.toString();

            DecimalFormat numberFormatPrecision = new DecimalFormat(finPattern);

            System.out.println("New value: " + numberFormatPrecision.format(numberToRound) );

        }catch (InputMismatchException ex) {

            System.err.print("Wrong format of number");

        }
    }
}