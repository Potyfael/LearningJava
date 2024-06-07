import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double soma=0, media;

        System.out.print("Quantas notas vode irá digitar? ");
        n = sc.nextInt();
        double[] notas = new double[n];

        for (int i=0; i < notas.length; i++) {
            System.out.printf("Digite a nota %d: ", i+1);
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.printf("Média: %.3f\n", media);
        System.out.println("Elementos abaixo da média:");
        for (double j : notas) {
            if (j < media) {
                System.out.printf("%.2f ", j);
            }
        }
        sc.close();
    }
}