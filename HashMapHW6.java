package HW6;

import java.util.*;

/* Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут
повторяющиеся имена с разными телефонами, их необходимо считать,
как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.*/
public class HashMapHW6 {
    static HashMap<String, ArrayList> contacts = new HashMap<>();
// так как в лист не получается записать значение, создаем метод для
    // ввода в одну строку имени и номера
    public static void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            ArrayList phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        } else {
            ArrayList phoneNumbers = new ArrayList();
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        }
    }

    // далее создаем метод для отображения списка пользователей в отсортированном
    // порядке по количеству тел номеров от большего к меньшему
    public static void printContacts() {
        ArrayList<Map.Entry<String, ArrayList>> list =
                new ArrayList<>(contacts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });
        for (Map.Entry<String, ArrayList> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        addContact("Албеков Игорь", "89085434432");
        addContact("Иванов Валентин", "89994321255");
        addContact("Албеков Игорь", "89905434432");
        addContact("Иванов Валентин", "89564351255");
        addContact("Сириряков Александр", "89004325343");
        addContact("Албеков Игорь", "89095434432");

        printContacts();
    }
}
