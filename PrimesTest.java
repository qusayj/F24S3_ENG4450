import com.jwetherell.algorithms.mathematics.Primes;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class PrimesTest {

    @Test
    public void testGetPrimeFactorization() {
        // Test with a composite number
        Map<Long, Long> factors = Primes.getPrimeFactorization(28L);
        assertEquals(Long.valueOf(2), factors.get(2L)); // 28 = 2^2 * 7
        assertEquals(Long.valueOf(1), factors.get(7L)); // 28 = 7^1

        // Test with a prime number
        factors = Primes.getPrimeFactorization(13L);
        assertEquals(Long.valueOf(1), factors.get(13L)); // 13 is prime

        // Test with edge case: 1 (no prime factors)
        factors = Primes.getPrimeFactorization(1L);
        assertTrue(factors.isEmpty()); // 1 has no prime factors
    }

    @Test
    public void testIsPrime() {
        // Test prime numbers
        assertTrue(Primes.isPrime(2));
        assertTrue(Primes.isPrime(3));
        assertTrue(Primes.isPrime(13));

        // Test composite numbers
        assertFalse(Primes.isPrime(4));
        assertFalse(Primes.isPrime(28));

        // Edge cases
        assertFalse(Primes.isPrime(1)); // 1 is not prime
        assertTrue(Primes.isPrime(17)); // Prime number
    }

    @Test
    public void testSieveOfEratosthenes() {
        // Test small prime numbers
        assertTrue(Primes.sieveOfEratosthenes(2));
        assertTrue(Primes.sieveOfEratosthenes(3));
        assertTrue(Primes.sieveOfEratosthenes(13));

        // Test composite numbers
        assertFalse(Primes.sieveOfEratosthenes(4));
        assertFalse(Primes.sieveOfEratosthenes(28));

        // Edge case
        assertFalse(Primes.sieveOfEratosthenes(1)); // 1 is not prime
    }

    @Test
    public void testMillerRabinTest() {
        // Test prime numbers
        assertTrue(Primes.millerRabinTest(2));
        assertTrue(Primes.millerRabinTest(3));
        assertTrue(Primes.millerRabinTest(13));

        // Test composite numbers
        assertFalse(Primes.millerRabinTest(4));
        assertFalse(Primes.millerRabinTest(28));

        // Edge case
        assertFalse(Primes.millerRabinTest(1)); // 1 is not prime
    }
}
