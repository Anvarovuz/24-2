import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(10));
            System.out.print(list.get(i) + " ");
        }

        int max = list.get(0);
        int min = list.get(0);
        double summ = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max) max = list.get(i);
            if (list.get(i) <= min) min = list.get(i);
            summ += list.get(i);
        }

        System.out.println("\nEng katta son - " + max);
        System.out.println("Eng kichik son - " + min);
        System.out.println("Kiritilgan raqamlarning o'rtacha qilmati - " + summ / list.size());
    }
}