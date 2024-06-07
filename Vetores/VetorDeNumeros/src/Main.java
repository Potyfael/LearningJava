import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i < vect.length; i++) {
            System.out.printf("Digite o valor do elemento #%d: ", i + 1);
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros negativos lidos: ");
        for (int i=0; i<vect.length; i++){
            if (vect[i] < 0)
                System.out.println(vect[i]);
        }
    }
}