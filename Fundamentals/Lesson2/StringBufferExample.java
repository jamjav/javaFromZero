package Fundamentals.Lesson2;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Rocks!");
        System.out.println(sb.toString()); // "Java Rocks!"
    }

}
