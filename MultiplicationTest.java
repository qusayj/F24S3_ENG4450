import com.jwetherell.algorithms.mathematics.Multiplication;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void testMultiplication() {
        assertEquals(20, Multiplication.multiplication(4, 5));
        assertEquals(-20, Multiplication.multiplication(4, -5));
        assertEquals(0, Multiplication.multiplication(0, 5));
        assertEquals(2147483647L * 2, Multiplication.multiplication(2147483647, 2)); // Test large values
    }

    @Test
    public void testMultiplyUsingLoop() {
        assertEquals(20, Multiplication.multiplyUsingLoop(4, 5));
        assertEquals(-20, Multiplication.multiplyUsingLoop(4, -5));
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 5));
        assertEquals(0, Multiplication.multiplyUsingLoop(5, 0));
    }

    @Test
    public void testMultiplyUsingRecursion() {
        assertEquals(20, Multiplication.multiplyUsingRecursion(4, 5));
        assertEquals(-20, Multiplication.multiplyUsingRecursion(4, -5));
        assertEquals(0, Multiplication.multiplyUsingRecursion(0, 5));
        assertEquals(0, Multiplication.multiplyUsingRecursion(5, 0));
    }

    @Test
    public void testMultiplyUsingShift() {
        assertEquals(20, Multiplication.multiplyUsingShift(4, 5));
        assertEquals(-20, Multiplication.multiplyUsingShift(4, -5));
        assertEquals(0, Multiplication.multiplyUsingShift(0, 5));
        assertEquals(0, Multiplication.multiplyUsingShift(5, 0));
    }

    @Test
    public void testMultiplyUsingLogs() {
        assertEquals(20, Multiplication.multiplyUsingLogs(4, 5));
        assertEquals(-20, Multiplication.multiplyUsingLogs(4, -5));
        assertEquals(0, Multiplication.multiplyUsingLogs(0, 5));
        assertEquals(0, Multiplication.multiplyUsingLogs(5, 0));
    }

    @Test
    public void testMultiplyUsingFFT() {
        assertEquals("20", Multiplication.multiplyUsingFFT("4", "5"));
        assertEquals("-20", Multiplication.multiplyUsingFFT("4", "-5"));
        assertEquals("0", Multiplication.multiplyUsingFFT("0", "5"));
        assertEquals("0", Multiplication.multiplyUsingFFT("5", "0"));
    }

    @Test
    public void testMultiplyUsingLoopWithStringInput() {
        assertEquals("20", Multiplication.multiplyUsingLoopWithStringInput("4", "5"));
        assertEquals("-20", Multiplication.multiplyUsingLoopWithStringInput("4", "-5"));
        assertEquals("0", Multiplication.multiplyUsingLoopWithStringInput("0", "5"));
        assertEquals("0", Multiplication.multiplyUsingLoopWithStringInput("5", "0"));
    }

    @Test
    public void testMultiplyUsingLoopWithIntegerInput() {
        assertEquals(20, Multiplication.multiplyUsingLoopWithIntegerInput(4, 5));
        assertEquals(-20, Multiplication.multiplyUsingLoopWithIntegerInput(4, -5));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(0, 5));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(5, 0));
    }
}
