import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi soni kiriting - ");
        int a = scanner.nextInt();

        System.out.print("Ikkinchi soni kiriting - ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println("\nJuft sonlar yig'indisi - " + sum);
    }
}