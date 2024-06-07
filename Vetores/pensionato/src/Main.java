import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, room;
        String nome, email;
        Hotel[] rooms = new Hotel[10];

        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.printf("#%d Rent:\n", i+1);
            System.out.print("Name: ");
            nome = sc.nextLine();

            System.out.print("Email: ");
            email = sc.next();

            System.out.print("Room: ");
            room = sc.nextInt();

            rooms[room-1] = new Hotel(nome, email);
        }
        System.out.println("Busy rooms:");
        for (int i=0; i< rooms.length; i++) {
            if (rooms[i] != null)
                System.out.printf("%d: %s\n", i+1, rooms[i]);
        }
        sc.close();
    }
}
