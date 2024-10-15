package itm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import itm.oss.Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator tests of OSS class")
public class CalculatorTests {
    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("Test for add function")
    void add(){
        assertEquals(10,calc.add(5, 5),"Expected value is 10 in add function");
    }

    @Test
    @DisplayName("Testing function isPrime (5)")
    void isFivePrime(){
        assertTrue(calc.isPrime(5),"5 is prime");
    }

    @Test
    @DisplayName("Testing function isPrime (4)")
    void isFourPrime(){
        assertFalse(calc.isPrime(4),"4 is not prime");
    }

    @Test
    @DisplayName("Testing function isPrime (0)")
    void isZeroPrime(){
        assertFalse(calc.isPrime(0),"0 is not prime");
    }

    @Test
    @DisplayName("Testing function isPrime with negative numbers")
    void testingNegativeNumber(){
        assertFalse(calc.isPrime(-1),"There are no negative prime numbers");
        assertFalse(calc.isPrime(-2),"There are no negative prime numbers");
        assertFalse(calc.isPrime(-3),"There are no negative prime numbers");
        assertFalse(calc.isPrime(-4),"There are no negative prime numbers");
        assertFalse(calc.isPrime(-5),"There are no negative prime numbers");
    }
}
