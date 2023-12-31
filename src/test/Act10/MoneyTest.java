package test.Act10;

import main.Act10.Dollar;
import main.Act10.Franc;
import main.Act10.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);

        assertEquals(Money.dollar(10), ((Dollar) five).times(2));

        assertEquals(Money.dollar(15), ((Dollar) five).times(3));
    }

    @Test
    public void testEquality() {
        // 三角測量（２つのテストで正しさを確認する
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));

        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);

        assertEquals(Money.franc(10), ((Franc) five).times(2));

        assertEquals(Money.franc(15), ((Franc) five).times(3));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDifferentClassEquality() {
        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }

}
