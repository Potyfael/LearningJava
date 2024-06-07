import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, maiorIdade=0, indexMaior=0;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();
        sc.nextLine();
        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i=0; i < nomes.length; i++) {
            System.out.printf("#%d PESSOA:\n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                indexMaior = i;
            }
        }
        System.out.printf("Pessoa mais velha: %s", nomes[indexMaior]);
        sc.close();
    }
}