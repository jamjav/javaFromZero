package Fundamentals.Lesson2;

import java.util.Arrays;

public class TextBlocks {

    public static void main(String[] args) {

        manageTextBlocks();

    }

    public static void manageTextBlocks() {

        String textBlock = """
                <html>
                    <body>
                        <h1>From Zero To Hero</h1>
                    </body>
                </html>
                """;

        System.out.println(textBlock);

        String texto = "Hola";
        texto.concat(" Mundo");
        System.out.println(texto);

    }

}
