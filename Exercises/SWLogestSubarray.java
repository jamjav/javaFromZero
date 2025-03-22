package Exercises;

public class SWLogestSubarray {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        System.out.println(longestSubarray(nums));
    }

    /*
     * Implementamos Sliding Window
     * técnica de optimización utilizada para resolver problemas sobre subarrays o
     * subsecuencias
     * en estructuras de datos lineales como arrays y strings.
     * La idea principal es usar dos punteros (o índices) para definir una ventana
     * móvil dentro
     * de la estructura de datos, evitando cálculos innecesarios y mejorando la
     * eficiencia en comparación con enfoques de fuerza bruta.
     */

    public static int longestSubarray(int[] nums) {

        int izq = 0;
        int maxLen = 0;
        int zeros = 0;

        for (int der = 0; der < nums.length; der++) {
            if (nums[der] == 0) {
                zeros++;
            }

            while (zeros > 1) {
                if (nums[izq] == 0) {
                    zeros--;
                }
                izq++;
            }
            maxLen = Math.max(maxLen, der - izq);
        }

        return maxLen;
    }
}
