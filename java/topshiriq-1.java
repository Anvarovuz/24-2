import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // maxsulot narxini kiritish
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mahsulot narxini kiriting - ");
        int narx = scanner.nextInt();

        // pulni hisoblash
        int[] a = {1, 3, 5, 10, 25, 50, 100, 200, 500, 1000, 5000, 10000, 50000};
        while (narx != 0) {
            for (int i = a.length - 1; i >= 0; i--) {
                if (narx >= a[i]) {
                    narx = narx - a[i];
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}