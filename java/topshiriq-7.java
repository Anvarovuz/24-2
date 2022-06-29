import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ombordagi qutilar sonini kiriting - ");
        int jamiQutilar = scanner.nextInt();

        int i = 1;
        while (jamiQutilar != 0) {
            System.out.print(i + " - chi mashinaga yuklanadigan qutilar sonini kiriting - ");
            int yuklanadiganQutilar = scanner.nextInt();

            if (yuklanadiganQutilar > jamiQutilar) {
                System.out.print("Omborda jami " + jamiQutilar + " ta quti qolgan, iltimos yuklanadigan qutilar sonini qayta kiriting - ");
                yuklanadiganQutilar = scanner.nextInt();
            }
            jamiQutilar = jamiQutilar - yuklanadiganQutilar;
            i++;
        }
        System.out.println("Omborda qutilar qolmadi!");
    }
}