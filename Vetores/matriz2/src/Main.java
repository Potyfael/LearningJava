import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor de M e N respectivamente: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i=0; i<m ; i++) {
            System.out.println();
            for (int j=0; j<n; j++) {
                System.out.printf("%d, %d: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Qual numero voce quer acessar? ");
        int num = sc.nextInt();
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j< mat[i].length; j++) {
                if (mat[i][j] == num) {
                    System.out.printf("Position: %d, %d\n", i, j);

                    if (j > 0)
                        System.out.printf("Left: %d\n", mat[i][j-1]);
                    if (j < mat[i].length-1)
                        System.out.printf("Right: %d\n", mat[i][j+1]);
                    if (i < mat.length-1)
                        System.out.printf("Down: %d\n", mat[i+1][j]);
                    if (i > 0)
                        System.out.printf("Up: %d", mat[i-1][j]);
                }
                else {
                    System.out.println("Elemento nao encontrado!");
                }
            }
        }
        sc.close();
    }
}