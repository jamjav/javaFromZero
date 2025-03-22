package Exercises;

import java.math.BigInteger;

public class GreatCommonDivisor {

    public String gcdOfStrings(String str1, String str2) {
        // Si la concatenación no es igual en ambos órdenes, no hay un divisor común
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Encontrar el MCD de las longitudes
        int gcdLength = gcd(str1.length(), str2.length());

        // Tomar los primeros "gcdLength" caracteres como resultado
        return str1.substring(0, gcdLength);
    }

    public static int gcd(int a, int b) {
        // Convertir los enteros a BigInteger
        BigInteger ba = BigInteger.valueOf(a);
        BigInteger bb = BigInteger.valueOf(b);

        // Calcular el MCD y convertirlo de nuevo a int
        return ba.gcd(bb).intValue();
    }

    public static void main(String[] args) {
        GreatCommonDivisor sol = new GreatCommonDivisor();
        System.out.println(sol.gcdOfStrings("ABCABC", "ABC")); // Salida esperada: "ABC"
        System.out.println(sol.gcdOfStrings("LEET", "CODE")); // Salida esperada: ""
    }
}