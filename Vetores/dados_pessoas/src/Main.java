import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, quantHomens=0, quantMulheres=0;
        double maior=0, menor=0, somaAlturaMulheres=0, mediaAlturaMulheres=0;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i=0; i < alturas.length; i++) {
            System.out.printf("#%d Pessoa:\n", i+1);
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            // verifica maior e menor altura
            if (i == 0) {
                menor = alturas[i];
                maior = alturas[i];
            }
            else {
                if (alturas[i] < menor)
                    menor = alturas[i];

                if (alturas[i] > maior)
                    maior = alturas[i];
            }

            System.out.print("Genero: ");
            generos[i] = sc.next().charAt(0);
            if (generos[i] == 'f') {
                quantMulheres++;
                somaAlturaMulheres += alturas[i];
            }
            else {
                quantHomens++;
            }
        }
        if (quantMulheres > 0)
            mediaAlturaMulheres = somaAlturaMulheres / quantMulheres;
        System.out.println("Dados:");
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d", quantHomens);
        sc.close();
    }
}