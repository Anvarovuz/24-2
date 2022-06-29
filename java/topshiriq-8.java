[Forwarded from 𝗛𝗢𝗝𝗜𝗔𝗞𝗕𝗔𝗥 𝗗𝗔𝗩𝗨𝗥𝗢𝗩]
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Son kiriting - ");
            a = scanner.nextInt();
            list.add(a);
        }
        while (a != 0);

        int max = list.get(0);
        int min = list.get(0);
        double summ = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max) max = list.get(i);
            if (list.get(i) <= min) min = list.get(i);
            summ += list.get(i);
        }

        System.out.println("Eng katta son - " + max);
        System.out.println("Eng kichik son - " + min);
        System.out.println("Kiritilgan raqamlar soni - " + list.size());
        System.out.println("Kiritilgan raqamlar yig'indisi - " + summ);
        System.out.println("Kiritilgan raqamlarning o'rtacha qilmati - " + summ / list.size());
    }
}