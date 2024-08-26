public class FibonacciSum {
    
    // Método para calcular a soma dos primeiros n elementos da Série de Fibonacci
    public static int sumOfFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        int sum = a + b;

        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        
        return sum;
    }
}

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciSumTest {

    @Test
    public void testSumOfFibonacci() {
        // Testes com valores conhecidos
        assertEquals(1, FibonacciSum.sumOfFibonacci(1));
        assertEquals(1, FibonacciSum.sumOfFibonacci(2));
        assertEquals(2, FibonacciSum.sumOfFibonacci(3));
        assertEquals(4, FibonacciSum.sumOfFibonacci(4));
        assertEquals(7, FibonacciSum.sumOfFibonacci(5));
        assertEquals(12, FibonacciSum.sumOfFibonacci(6));
        assertEquals(20, FibonacciSum.sumOfFibonacci(7));
        assertEquals(33, FibonacciSum.sumOfFibonacci(8));
        assertEquals(54, FibonacciSum.sumOfFibonacci(9));
        assertEquals(88, FibonacciSum.sumOfFibonacci(10));
    }
    
    @Test
    public void testSumOfFibonacciEdgeCases() {
        // Testes para casos de borda
        assertEquals(0, FibonacciSum.sumOfFibonacci(0));
        assertEquals(1, FibonacciSum.sumOfFibonacci(1));
        assertEquals(1, FibonacciSum.sumOfFibonacci(2));
    }
}
