package Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Extracandies {

    public static void main(String[] args) {
        int[] firstTest = { 2, 3, 5, 1, 3 };
        int[] secondTest = { 4, 2, 1, 1, 2 };

        var firstTestList = Arrays.stream(firstTest).boxed().toList();
        var secondTestList = Arrays.stream(secondTest).boxed().toList();

        // Syntaxis antigua
        System.out.println(Arrays.toString(kidsWithCandies(firstTest, 3)));
        System.out.println(Arrays.toString(kidsWithCandies(secondTest, 3)));

        // Syntaxis moderna
        System.out.println(kidsWithCandiesModern(firstTestList, 3));
        System.out.println(kidsWithCandiesModern(secondTestList, 3));
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        boolean[] result = new boolean[len];
        int max = 0;

        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        for (int i = 0; i < len; i++) {
            result[i] = (candies[i] + extraCandies >= max);
        }
        return result;
    }

    public static List<Boolean> kidsWithCandiesModern(List<Integer> candies, int extraCandies) {

        int max = Collections.max(candies);

        return candies.stream()
                .map(candy -> candy + extraCandies > max) // Transformar cada elemento en booleano
                .collect(Collectors.toList());
    }

}
