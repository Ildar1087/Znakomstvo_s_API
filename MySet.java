package seminar6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* Написать класс имитирующий работу hashSet и хранящий int */
public class MySet {
    //    private List<Integer> myList = new ArrayList<>();
    private HashMap<Integer, Object> myDb = new HashMap<>();
    private static final Object MYOBJ = new Object();

    // метод для добавления элементов
    public boolean add(int elem) { // метод, который добавляет в myList новый элемент
        return myDb.put(elem, MYOBJ) == null;
    }

    // метод для удаления элементов
    public boolean del(int elem) {
        return myDb.remove(elem) == MYOBJ;
    }

    // метод возвращающий true, если элемент пустой
    public boolean isEmpty() {
        return myDb.isEmpty();
    }

    // Метод для проверки наличия элемента в Set, возвращающий True при наличии
    public boolean contains(int elem) {
        return myDb.containsKey(elem);
    }

    // метод возвращающий значение по индексу в Sete
    public int get(int index) {
        Object[] a = myDb.keySet().toArray();
        return (int) a[index];
    }

    public Iterator<Integer> iterator() {
        return myDb.keySet().iterator();
    }


    public static void main(String[] args) {
        MySet myObj = new MySet();
        System.out.println(myObj.add(1));
        System.out.println("есть в наличии: " + myObj.contains(1));
        System.out.println(myObj.add(2));
        System.out.println(myObj.add(3));
        System.out.println(myObj.add(1));
        System.out.println("это get: " + myObj.get(1));
        System.out.println("isEmpty: " + myObj.isEmpty());
//        System.out.println(myObj.del(1));
//        System.out.println(myObj.del(2));
//        System.out.println(myObj.del(3));
        System.out.println("isEmpty: " + myObj.isEmpty());

        // напишем метод итератор
        Iterator<Integer> iterator = myObj.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }

        myObj.add(2);
        myObj.add(1);

//1:29
    }
}
