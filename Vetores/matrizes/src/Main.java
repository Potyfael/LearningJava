import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de m: ");
        int m = sc.nextInt();

        int[][] mat = new int[m][m];
        int somador=0;

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j< mat.length; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0)
                    somador++;
            }
        }

        System.out.println("Matriz inteira:");
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j< mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Principal diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println("\nTotal de negativos: " + somador);
        sc.close();
    }
}
