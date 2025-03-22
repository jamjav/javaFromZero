package Fundamentals;

import java.util.Arrays;
import java.util.Stack;

public class BSDailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        System.out.println("Temperaturas: " + Arrays.toString(temperatures));
        System.out.println("Resultado: " + Arrays.toString(dailyTemperatures(temperatures)));
    }

    static public int[] dailyTemperatures(int[] temperatures) {

        int len = temperatures.length;
        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            System.out.println("\nIteración " + i + " (Temperatura actual: " + temperatures[i] + ")");
            System.out.println("Stack antes de procesar: " + stack);

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex; // Días que transcurrieron
                System.out.println("Pop: Índice " + prevIndex + " (Temp: " + temperatures[prevIndex] + ")");
                System.out.println("Stack después de pop: " + stack);
            }

            stack.push(i);
            System.out.println("Push: Índice " + i + " (Temp: " + temperatures[i] + ")");
            System.out.println("Stack después de push: " + stack);
            System.out.println("Array result actual: " + Arrays.toString(result));
        }

        return result;
    }
}
