import java.util.ArrayList; // Динамические массивы
import java.util.Arrays; // Создание списков
import java.util.List; // Тоже тема для списков

public class myFirstAlgoritm { // Класс в котором я пишу код

    private static List<String> selectionSort(List<String> names) { // Метод сортировки 
        List<String> sortedListNames = new ArrayList<>(); // Тут новый список в котором будут хранится отсортированные имена

        while(!names.isEmpty()) { // Цикл while работает пока список listNames не будет пуст
            String smallestName = findSmallest(names); // Переменная для хранения наименьшего значения
            sortedListNames.add(smallestName); // Добавление в новый список

            names.remove(smallestName); // Удаление предыдущего значения из исходного списка для продолжения проверки
    }

    return sortedListNames; // Возвращаем в новый отсортированный спиоск
 }
    private static String findSmallest(List<String> names) { // Метод для поиска наименьшего значения по алфавиту
        String smallest = names.get(0); // Переменная для меньшего значения

        for (String name : names) { // Цикл for для того что бы перебрать все имена из списка
            if(name.compareTo(smallest) < 0) { // Если текущее имя меньше по алфавиту, если захоется поставить всё в обратном порядке просто нужно поменять оператор "<" на ">"
            smallest = name; // Тут объявляется самое маленькое имя по алфавиту
    }
}
return smallest; // Возвращаем 
    
}
    public static void main(String[] args) throws Exception { // Метод в котором всё и начинается тут хранятся имена
        List<String>  listNames = new ArrayList<>(Arrays.asList("Amir", "Madina", "Tamerlan", "Liaisan", "Emir", "Ainur", "Kanat")); // Сам список с именами
        System.out.println(selectionSort(listNames)); // Вывод на экран итогого списка
   }
}