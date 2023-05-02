import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double art1, arc2, arc3, arc4, art5, total;
        double[] Totalp = new double[4];
        Totalp[0] = 0;
        Totalp[1] = 0;
        Totalp[2] = 0;
        Totalp[3] = 0;
        Totalp[4] = 0;

        Scanner entra = new Scanner(System.in);
        int x, y = 1;
        art1 = 2.98;
        arc2 = 4.50;
        arc3 = 9.98;
        arc4 = 4.49;
        art5 = 6.87;

        System.out.println("que  productos vendio");
        x = entra.nextInt();
        switch (x) {
            case 1:
                Totalp[0] += art1;
                break;

            case 2:
                Totalp[1] += arc2;
                break;

            case 3:
                Totalp[2] += arc3;
                break;
            case 4:

                Totalp[3] += arc4;
                break;
            case 5:
                Totalp[4] += art5;
                break;
            default:
                System.out.println("el producto no se encuentra en la lista ");
        }
        total = (Totalp[0] + Totalp[1] + Totalp[2] + Totalp[3] + Totalp[4]);
        System.out.println("desea salir");
        y = entra.nextInt();
        if (y == 0) {
            System.out.println("del  producto  1 vendio: " + Totalp[0]);
            System.out.println("del  producto  2 vendio: " + Totalp[1]);
            System.out.println("del  productos 3 vendio: " + Totalp[2]);
            System.out.println("del  productos 4 vendio: " + Totalp[3]);
            System.out.println("del productos  5 vendio: " + Totalp[4]);
            System.out.println("la venta total fue: " + total);
        }

        entra.close();
    }
}
