import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];


        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double maiorNumero = vect[0];
        int indexOf=0;

        for (int i=0; i < vect.length; i++) {
            if (vect[i] > maiorNumero) {
                maiorNumero = vect[i];
                indexOf = i;
            }
        }

        System.out.printf("Maior valor: %.2f\n", maiorNumero);
        System.out.printf("indice: %d", indexOf);


    }
}