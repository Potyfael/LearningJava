import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double soma=0, media;

        System.out.print("Digite quantos numeros voce vai usar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<vect.length; i++) {
            System.out.printf("Digite o numero do elemento %d: ", i+1);
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        media = soma / n;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Valores = ");
        for (int i=0; i<vect.length; i++) {
            System.out.printf("%.2f ", vect[i]);
        }
        System.out.printf("\nSoma = %.2f", soma);
        System.out.printf("\nMedia = %.2f", media);
        sc.close();
    }
}