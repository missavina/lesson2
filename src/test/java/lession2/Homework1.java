package lession2;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class Homework1 {
    private Integer sum;
    private double firstPrice = 90.00;
    private double secondPrice = 88.00;
    private double servicePrice = 5.00;
    private double finalResult = 250.00;


    @Test
    public void sumDigits() {
        //sum first digit with 21%
        double result = addPVN(firstPrice,21);
        //sum second digit with 21%
        double secResult = addPVN(secondPrice,21);
        //sum third price with 5%
        double thirdResult = addPVN(servicePrice, 5);
        //sum the result
        double sum = result + secResult + thirdResult;
        //cheking the first,second,third price with final result
        Assert.assertEquals("wrong result", finalResult, sum, 0);


    }

    private double addPVN(double price, double percentage) {
        return price * percentage / 100 + price;
    }
}
