import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n, num, cont = 100000;
        Scanner entra = new Scanner(System.in);
        System.out.println("digite la cantidad de numeros");
        n = entra.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("digite la cantidad de numeros");
            num = entra.nextInt();
            if (num < cont) {
                cont = num;
            }
        }
        System.out.println("el numero menor es: " + cont);
        entra.close();
    }
}
