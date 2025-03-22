package Fundamentals.Lesson2;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("From");
        sb.append(" Hero"); // Agrega " Hero"
        sb.insert(9, " To"); // Inserta " To" en la posición correcta
        sb.replace(9, 12, " To Principal"); // Reemplaza "To" por "Principal"

        System.out.println(sb.toString()); // "From Hero Principal"
    }
}
