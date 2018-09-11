package lession2;

import org.junit.Assert;
import org.junit.Test;

public class Homework2 {
    private double creditAmount = 100000;
    private double amountToReturn = 103997;

    @Test
    public void sumDigits() {
        //сумму кредита делю на 3 года, получаю сумму оплаты за 10 лет
        //к полученной сумме прибавляю годовой процент (6%)
        double firstTen = toPayForTenYears(6);
        //прибавляю к сумме кредита за 10 лет 4%
        double secondTen = toPayForTenYears(4);
        //прибавляю к сумме кредита за 10 лет 2%
        double thirdTen = toPayForTenYears(2);
        //складываю 3 суммы вместе
        double result = firstTen + secondTen + thirdTen;
        //проверка
        Assert.assertEquals("wrong result", amountToReturn, result, 0); //сообщение если проверка НЕ пройдет, ожидаемый результат, результат, который надо вернуть, погрешность)

    }

    private double toPayForTenYears(double percentage) {
        double amount10y = creditAmount / 3;
        return amount10y * percentage / 100 + amount10y;
    }

    }


