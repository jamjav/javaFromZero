package Fundamentals.Lesson2;

import java.util.Arrays;

public class Strings {

    public static void manageString(String text) {

        System.out.println("🔹 La longitud del texto: " + text.length());
        System.out.println("🔹 Upper Case: " + text.toUpperCase());
        System.out.println("🔹 Lower Case: " + text.toLowerCase());
        System.out.println("🔹 Sin Espacios: " + text.trim());
        System.out.println("🔹 Sin Espacios con strip: " + text.strip());
        System.out.println("🔹 Repitiendo 3 veces: " + text.repeat(3));
        System.out.println("🔹 Validando blanco: " + text.isBlank());
        char[] caracteres = text.toCharArray();
        System.out.println("🔹 Convirtiendo en array: " + Arrays.toString(caracteres)); // [H, o, l, a]

    }

    public static void main(String[] args) {
        manageString("From Zero To Principal");
    }

}
