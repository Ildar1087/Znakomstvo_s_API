package org.example;

public class HW2 {
    public static void main(String[] args) {
        String str = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}" +
                ",{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String str1 = " ";
        String str2 = " ";
        String str3 = " ";

        str = str.replaceAll("\\p{P}"," ").replaceAll("\\s", " ");
        str = str.trim();
        str = str.replace("  ", "");
        str = str.replace("фамилия", "Студент");
        str = str.replace("оценка", "получил");
        str = str.replace("предмет", "по предмету");
        System.out.println("Это чистая строка: " + str);
        System.out.println(str.indexOf("Студент", 1)); // 48
        str1 = str.substring(0, 47); // подстрока str1 из строки
        System.out.println(str1 + ".");
        System.out.println(str.indexOf("Студент",49)); // 98
        str2 = str.substring(48, 97); // подстрока str2 из строки
        System.out.println(str2 + ".");
        System.out.println(str.length()); // длина строки
        str3 = str.substring(98, 142); // подстрока str3 из строки
        System.out.println(str3 + ".");
    }
}
/* Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/