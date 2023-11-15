import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int AllCranes = scanner.nextInt();
        int Katya = (AllCranes / 3) * 2;
        int Petya = Katya / 2 / 2;
        int Serega = Petya;
        System.out.println(Petya + " " + Katya + " " + Serega);
    }
}