import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao registradas? ");
        int quantPessoas = sc.nextInt();
        sc.nextLine();

        String [] vectNomes = new String[quantPessoas];
        int[] vectIdades = new int[quantPessoas];
        double[] vectAlturas = new double[quantPessoas];

        double somaAltura=0, alturaMedia, percentualMenores;
        int menor16=0;


        for (int i=0; i<quantPessoas; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);

            System.out.print("Nome: ");
            vectNomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            vectIdades[i] = sc.nextInt();
            if (vectIdades[i] < 16)
                menor16++;

            System.out.print("Altura: ");
            vectAlturas[i] = sc.nextDouble();
            somaAltura += vectAlturas[i];

            sc.nextLine();

        }

        alturaMedia = somaAltura / quantPessoas;
        percentualMenores = ((double) menor16 / quantPessoas) * 100.0;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("Altura media: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentualMenores);
        for (int i=0; i < quantPessoas; i++) {
            if (vectIdades[i] < 16)
                System.out.println(vectNomes[i]);
        }

        sc.close();

    }
}