
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zalda foydalanuvchilarning sonini kiriting - ");
        int soni = scanner.nextInt();

        for (int i = 0; i < soni; i++) {
            System.out.print(i + 1 + " - chi foydalanuvchining yoshini kiriting - ");
            list.add(scanner.nextInt());
        }

        int max = list.get(0);
        int min = list.get(0);
        double summ = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max) max = list.get(i);
            if (list.get(i) <= min) min = list.get(i);
            summ += list.get(i);
        }

        System.out.println("Eng katta yosh - " + max);
        System.out.println("Eng kichik yosh - " + min);
        System.out.println("Foydalanuvchilarning soni - " + list.size());
        System.out.println("Foydalanuvchilarning o'rtacha qilmati - " + summ / list.size());
    }
}