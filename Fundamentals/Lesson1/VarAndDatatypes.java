package Fundamentals.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 	1.	Declara y asigna valores a variables de distintos tipos (int, double, boolean, String, List, Map).
	2.	Usa var para la inferencia de tipos donde sea posible.
	3.	Imprime las variables y sus valores.
	4.	Muestra el uso de memoria en el Heap antes y después de crear un gran objeto.
 */

public class VarAndDatatypes {
    public static void main(String[] args) {

        imprimirUsoMemoria("Antes de declarar primitivos");
        declarePrimitive();
        imprimirUsoMemoria("Despues de declarar primitivos");

        imprimirUsoMemoria("Antes de declarar Tipos referenciados");
        declareReferenceType();
        imprimirUsoMemoria("Despues de declarar Tipos referenciados");

        declareUsingVar();
    }

    public static void declarePrimitive() {

        System.out.println("\n🔹 " + "Declarando variables primitivas: ");

        int varInt = 10;
        double varDouble = 10.6;
        boolean varBool = true;

        System.out.println("Entero: " + varInt);
        System.out.println("Double: " + varDouble);
        System.out.println("Boolean: " + varBool);

    }

    public static void declareReferenceType() {

        System.out.println("\n🔹 " + "Declarando Referencias: ");

        String varString = "From Zero to Principal";
        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<String> immutableList = List.of("Java", "Python", "C++");
        int[] bigArray = new int[10_000_000];

        System.out.println("Lista : " + listNumbers);
        System.out.println("Lista Inmutable: " + immutableList);
        System.out.println("String: " + varString);
        System.out.println("Array length: " + bigArray.length);
    }

    public static void declareUsingVar() {

        System.out.println("\n🔹 " + "Declarando usando var: ");

        var varString = "From Zero to Principal";
        var listNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        var immutableList = List.of("Java", "Python", "C++");
        var bigArray = new int[10_000_000];

        System.out.println("Lista: " + listNumbers);
        System.out.println("Lista Inmutable: " + immutableList);
        System.out.println("String: " + varString);
        System.out.println("Array length: " + bigArray.length);
    }

    public static void imprimirUsoMemoria(String mensaje) {
        Runtime runtime = Runtime.getRuntime();
        long memoriaTotal = runtime.totalMemory() / 1024 / 1024; // MB
        long memoriaLibre = runtime.freeMemory() / 1024 / 1024; // MB
        long memoriaUsada = memoriaTotal - memoriaLibre;

        System.out.println("\n🔹 " + mensaje);
        System.out.println("Memoria Total en Heap: " + memoriaTotal + " MB");
        System.out.println("Memoria Libre en Heap: " + memoriaLibre + " MB");
        System.out.println("Memoria Usada en Heap: " + memoriaUsada + " MB\n");
    }
}
