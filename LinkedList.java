package Seminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол
2. вывод в формате Фамилия И.О. возраст пол
3. добавить возможность выхода или вывода списка отсортированного по возрасту!)
4. *реализовать сортировку по возрасту с использованием индексов
5. *реализовать сортировку по возрасту и полу с использованием индексов*/

public class LinkedList {
    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);
        ArrayList<String> listData = new ArrayList<>(1);

        while (!str.equals("Exit")) {
            System.out.println("Введите ФИО, возраст, пол: ");
            str = in.nextLine();
            if (!str.equals("Exit")) {
                String[] tmp = new String[3];
                tmp = str.split(",");
                System.out.println("Это tmp.split: " + Arrays.toString(tmp));
                String[] fio = new String[3];
                fio = tmp[0].split(" ");
                System.out.println("Это fio.split2: " + Arrays.toString(fio));
                String itogStr = fio[0] + " " + fio[1].toUpperCase().charAt(0) + "." + fio[2].toUpperCase().charAt(0) + "." + tmp[1] + tmp[2];
                System.out.println("Это itogStr: " + itogStr);
                listData.add(itogStr);
            }
        }
        listData.sort(new Comparator<String>() { // здесь проходим по листу сравнивая возраст методом Compare, тем самым
            // осуществляя его сортировку
            @Override
            public int compare(String o1, String o2) {
                int r = Integer.parseInt(o1.split(" ")[2]) - Integer.parseInt(o2.split(" ")[2]);
                return r;
            }
        });

        for (int i = 0; i < listData.size(); i++) {
            System.out.println(listData.get(i));
        }
    }
}

