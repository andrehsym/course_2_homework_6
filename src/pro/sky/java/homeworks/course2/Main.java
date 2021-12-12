package pro.sky.java.homeworks.course2;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //exercise 1
        System.out.println("exercise 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(e -> e % 2 != 1);
        System.out.println("Нечетные числа: " + nums);

        System.out.println();

        ////exercise 2////
        System.out.println("exercise 2");

        List<Integer> nums1 = new ArrayList<>(List.of( 7, 1, 5, 158, 6, 2, 3, 44, 4, 1, 4, 5));
        //nums1.sort(Comparator.naturalOrder());
        Set<Integer> nums1Set = new HashSet<>(nums1);
        nums1Set.removeIf(i -> i % 2 == 1);
        System.out.println("Четные числа без потворений: " + nums1Set);

        System.out.println();

        ////exercise 3////
        System.out.println("exercise 3");

        List<String> letters = new ArrayList<>(List.of("В", "качестве", "отладочной", "информации", "возьмите", "произвольный",
                "набор", "слов", "или", "текст", "в", "котором", "встречаются", "повторения", "Это", "может", "быть",
                "произвольный", "набор", "слов", "литературный", "текст", "или", "произвольное", "предложение"));
        Set<String> lettersSet = new HashSet<>(letters);
        System.out.println("Уникальные слова: " + lettersSet);

        System.out.println();

        ////exercise 4////
        System.out.println("exercise 4");

        List<String> letters2 = new ArrayList<>(List.of("лес", "окно", "лес", "стул", "дом", "хлеб", "хлеб", "окно", "стул", "лес", "вода"));
        Set<String> letters2Set = new HashSet<>(letters2);
        int RepeatingElements = letters2.size() - letters2Set.size();
        System.out.println("Все количество дублей из списка слов: " + RepeatingElements);

        List<String> copyOfRepeatingElements = new ArrayList<>();
        for (int i = 0; i < letters2.size(); i++) {
            for (int k = i + 1; k < letters2.size(); k++) {
                if (letters2.get(i).equals(letters2.get(k))) {
                    copyOfRepeatingElements.add(letters2.get(i));
                    letters2.remove(k);
                }
            }
        }
        System.out.println("Повторяющиеся слова в списке: " + copyOfRepeatingElements);

        System.out.println();
    }
}
