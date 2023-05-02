import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entra = new Scanner(System.in);
        boolean Correcto = false;
        int numFilasRombos;
        do {
            System.out.print("Introduce el número de filas (NATURAL E IMPAR): ");
            numFilasRombos = entra.nextInt();
            if (numFilasRombos > 0 && numFilasRombos % 2 != 0) {
                Correcto = true;
            }
        } while (!Correcto);

        System.out.println("");

        int numFilas = numFilasRombos / 2 + 1;

        for (int altura = 1; altura <= numFilas; altura++) {
            // Blancos
            for (int i = 1; i <= numFilas - altura; i++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int asteriscos = 1; asteriscos <= (2 * altura) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        numFilas--;

        for (int altura = 1; altura <= numFilas; altura++) {
            // Blancos
            for (int blancos = 1; blancos <= altura; blancos++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int asteriscos = 1; asteriscos <= (numFilas - altura) * 2 + 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
        entra.close();
    }
}
