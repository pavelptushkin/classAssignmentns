import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void add() {
        Calc nCalc = new Calc();
        double answer = nCalc.add(6,7);
        assertEquals(13, answer, 0);
    }

    @Test
    public void subtract() {
        Calc nCalc = new Calc();
        double answer = nCalc.subtract(8,7);
        assertEquals(1, answer, 0);
    }

    @Test
    public void multiply() {
        Calc nCalc = new Calc();
        double answer = nCalc.multiply(2,2);
        assertEquals(4, answer, 0);
    }

    @Test
    public void divide() {
        Calc nCalc = new Calc();
        double answer = nCalc.divide(2,2);
        assertEquals(1, answer, 0);
    }
}