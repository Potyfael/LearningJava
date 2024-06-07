import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, quantPar=0, somaPar=0;
        double mediaPar;

        System.out.print("Quantos elementos vai ter o vetor: ");
        n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i < vect.length; i++) {
            System.out.printf("#%d Digite um numero: ", i+1);
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                quantPar++;
                somaPar += vect[i];
            }
        }
        if (quantPar > 0) {
            mediaPar = somaPar / quantPar;
            System.out.printf("MEDIA DOS PARES = %.1f", mediaPar);
        }
        sc.close();
    }
}