
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
        StringBuffer sb = new StringBuffer("123");
        sb.setCharAt(1, '9');
        System.out.println(sb);
    }
}