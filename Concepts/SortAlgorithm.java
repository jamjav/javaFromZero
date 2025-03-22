package Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlgorithm {


    /*  Bubble Sort es un algoritmo de ordenamiento simple que compara y intercambia elementos adyacentes en un array repetidamente hasta que esté ordenado.

    🔹 Funciona en O(n²), lo que lo hace ineficiente para grandes volúmenes de datos.
    🔹 Es un algoritmo estable (no cambia el orden relativo de elementos iguales).
    🔹 No es óptimo para uso real, pero sirve para aprender los fundamentos de ordenamiento.

    */   
    public int[]  bubbleSort(int[] arr) {
        int len = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i< len -1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);

        return arr;
    
    }


    /*
     *  ✅ Mucho más rápido que Bubble Sort (O(n log n) vs O(n²)).
        ✅ Divide el array en subarrays y ordena cada parte recursivamente.
        ✅ No requiere memoria extra significativa (O(1)), a diferencia de MergeSort (O(n)).
        ✅ No es estable (el orden relativo de elementos iguales puede cambiar).
     */

    public List<Integer>  quickSort(List<Integer> arr) {

        if (arr.size() <= 1 ) return arr;

        int pivot = arr.get(arr.size() /2);

        List<Integer> left = arr.stream().filter(x -> x < pivot).collect(Collectors.toList());
        List<Integer> middle = arr.stream().filter(x -> x == pivot).collect(Collectors.toList());
        List<Integer> right = arr.stream().filter(x -> x > pivot).collect(Collectors.toList());

        return List.of(quickSort(left), middle, quickSort(right))
            .stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
    }

    public int[]  mergeSort(int[] arr) {
    
        return arr;
    }


    public static void main(String[] args) {
        SortAlgorithm sol = new SortAlgorithm();
        int[] arr = {5, 3, 8, 4, 2};
        
        System.out.println(Arrays.toString(sol.bubbleSort(arr))); 
        System.out.println(sol.quickSort(Arrays.asList(5, 3, 8, 4, 2))); 

    }
    
}
