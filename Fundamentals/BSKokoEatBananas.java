package Fundamentals;

import java.util.Arrays;

/*
 * ¿Qué es Binary Search?

Binary Search es un algoritmo eficiente para buscar un valor en una colección ordenada. 
Se basa en dividir el espacio de búsqueda a la mitad en cada iteración, 
lo que reduce drásticamente el número de comparaciones necesarias.

¿Cuándo usarlo?

✅ El conjunto de datos está ordenado.
✅ Se necesita buscar un valor óptimo en un rango (ej. mínimo o máximo posible).
✅ Los valores cumplen una condición boolean (True/False) que permite descartar la mitad del espacio de búsqueda.

 */

public class BSKokoEatBananas {

    public static void main(String[] args) {
        int[] nums = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(nums, h));
    }

    static public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canEat(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
            System.out.println("low:" + low + " mid: " + mid + " mid: " + mid);

        }

        return low;

    }

    private static boolean canEat(int[] piles, int h, int k) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += Math.ceil((double) pile / k);
        }
        return hoursNeeded <= h;
    }
}
