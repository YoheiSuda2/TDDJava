package test.Act7;

import main.Act7.Dollar;
import main.Act7.Franc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));

        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        // 三角測量（２つのテストで正しさを確認する
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));

        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);

        assertEquals(new Franc(10), five.times(2));

        assertEquals(new Franc(15), five.times(3));
    }

}
