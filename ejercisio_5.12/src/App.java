public class App {
    public static void main(String[] args) throws Exception {
        int imp = 1;
        for (int i = 0; i <= 15; i++) {
            if (i % 2 != 0) {
                imp *= i;
            }
        }
        System.out.println("el producto de la multiplicacion es: " + imp);
    }
}
