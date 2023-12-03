import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HW3_practika_seminar {
    public static void main(String[] args) {
    /*
        Задание
    Пусть дан произвольный список целых чисел.
    1) Нужно удалить из него чётные числа
    2) Найти минимальное значение
    3) Найти максимальное значение
    4) Найти среднее значение
    */
        ArrayList<Integer> lis = new ArrayList<>();
        ArrayList<Integer> lis2 = new ArrayList<>();
        // динамический массив
        // <> - это обобщение или generic
        // заполним лист случайными числами
        for (int i = 0; i < 15; i++) {
            lis.add(new Random().nextInt(10));
//            lis2.add(new Random().nextInt(10));
        }
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("list: " + lis);
        System.out.println("Максимальное значение: " + Collections.max(lis)); // максимальное значение
        System.out.println("Минимальное значение: " + Collections.min(lis)); // минимальное значение


        System.out.print("Список не чётных чисел: ");
        for (int i = 0; i < lis.size(); i++) {
            if (lis.get(i) % 2 != 0) {
                System.out.print(lis.get(i) + " ");
            }
        }
        System.out.println();// Пустая строка разделитель
        System.out.print("Среднее значение: ");
        int[] a = {0};
        lis.forEach(n -> a[0] += n);
        System.out.println(a[0]);

        int sum = 0;
        double sr = 0;
        System.out.print("Среднее значение: ");
        for (int i = 0; i < lis.size(); i++) {
            sum += lis.get(i);
            sr = sum/lis.size();
        }
        System.out.println(sr);

    }
}
