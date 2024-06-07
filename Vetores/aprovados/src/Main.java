import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;


        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] alunos = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];


        for (int i=0; i<n; i++) {

            // verifica nome do aluno
            System.out.printf("#%d Aluno:\n", i+1);
            System.out.print("Nome: ");
            alunos[i] = sc.nextLine();

            // verifica as duas notas1 do aluno
            System.out.println("Primeira e segunda nota: ");
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Alunos aprovados:");
        for (int i=0; i<n; i++) {
            if ( (notas1[i] + notas2[i]) /2 >= 6)
                System.out.println(alunos[i]);
        }
        sc.close();
    }
}