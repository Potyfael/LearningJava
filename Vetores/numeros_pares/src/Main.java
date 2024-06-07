import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, somaPares=0;

        System.out.print("QUantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0)
                somaPares++;
        }
        System.out.println("Numeros pares:");
        for (int j : vect) {
            if (j % 2 == 0)
                System.out.printf("%d ", j);
        }
        System.out.printf("\nQuantidade de pares: %d", somaPares);
        sc.close();
    }
}