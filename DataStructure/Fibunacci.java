package DataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Fibunacci {

    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10; // Número de términos a imprimir

        System.out.println("""

                🔹 Fibonacci Recursivo (O(2ⁿ))
                """);

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " "); // Imprime cada número de la secuencia
        }

        System.out.println("""

                🔹 Fibonacci Sequence Memotizacion:""");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        fibonacciNoRecursive(n);
    }

    public static int fibonacci(int n) {

        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void fibonacciNoRecursive(int n) {

        System.out.println("""

                🔹 Fibonacci No Recursivo )
                """);

        int[] res = new int[n];

        res[0] = 0;
        res[1] = 1;

        for (int i = 2; i < res.length; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }

        System.out.println(Arrays.toString(res));
    }

    public static int fibonacciMemo(int n) {
        if (n <= 1)
            return n;
        if (memo.containsKey(n))
            return memo.get(n);

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

}
