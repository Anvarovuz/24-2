import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Birinchi sonni kiritish
        double birinchiSon;
        do {
            System.out.print("Birinchi sonni kiriting ([1;9] oraliqda bo'lsin) - ");
            birinchiSon = scanner.nextDouble();
        }
        while (birinchiSon < 1  birinchiSon > 9);

        // Ikkinchi sonni kiritish
        double ikkinchiSon;
        do {
            System.out.print("Ikkinchi sonni kiriting ([1;9] oraliqda bo'lsin) - ");
            ikkinchiSon = scanner.nextDouble();
        }
        while (ikkinchiSon < 1  ikkinchiSon > 9);

        // Ko'paytmani tekshirish
        System.out.print("Javobini kiriting - ");
        double javob= scanner.nextDouble();

        if (javob==birinchiSon*ikkinchiSon){
            System.out.println("Tabriklaymiz! siz to'g'ri topdingiz");
        }
        else {
            System.out.println("Javob noto'g'ri, karra jadvalini yod oling");
        }
    }
}