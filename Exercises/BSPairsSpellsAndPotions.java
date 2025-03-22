package Exercises;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BSPairsSpellsAndPotions {

    public static void main(String[] args) {
        int[] spells = { 5, 1, 3 };
        int[] potions = { 1, 2, 3, 4, 5 };
        long success = 7;

        // System.out.println(Arrays.toString(successfulPairs(spells, potions,
        // success)));
        System.out.println(Arrays.toString(successfulPairsBS(spells, potions, success)));
    }

    static public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int len = spells.length;
        int[] potionsSuccess = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < len; i++) {
            int failed = 0;
            for (int j = 0; j < potions.length; j++) {
                if (spells[i] * potions[j] >= success) {
                    potionsSuccess[i] = (potions.length) - failed;
                    break;
                } else {
                    failed++;
                }
            }
        }

        return potionsSuccess;
    }

    static public int[] successfulPairsBS(int[] spells, int[] potions, long success) {

        int len = spells.length;
        int[] potionsSuccess = new int[len];
        Arrays.sort(potions);

        for (int i = 0; i < len; i++) {

            int left = 0, right = potions.length - 1;
            int index = potions.length;
            System.out.println("Interacion: " + i);
            while (left <= right) {
                System.out.println("ventana: " + left + " - " + right);
                int mid = left + (right - left) / 2;
                System.out.println("Mid: " + mid + " spells: " + spells[i] + " * potions: " + potions[mid]);
                if ((long) spells[i] * potions[mid] >= success) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
            potionsSuccess[i] = potions.length - index;
        }
        return potionsSuccess;
    }

}
