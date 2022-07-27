import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 9, 9, 11, 12, 20, 5555, 2022));
        List<Integer> numEven = new ArrayList<>();
        Set<Integer> numberEven = new HashSet<>();
        Set<Integer> numberOdd = new HashSet<>();
        List<String> words = new ArrayList<>(List.of("11opel", "3nissan", "5ford", "5ford", "5ford", "5ford", "5ford", "jeep", "3nissan", "3nissan",
                "11opel", "11opel", "11opel", "11opel", "11opel", "11opel", "11opel", "11opel", "11opel", "11opel"));
        Set<Integer> wordsSort = new HashSet<>();

        for (Integer num : nums) {
            int odd = 0;
            int even = 0;
            if (Integer.valueOf(num) % 2 != 0) {
                even++;
                numEven.add(Integer.valueOf(num));
                numberEven.add(Integer.valueOf(num));
            } else {
                odd++;
                numberOdd.add(Integer.valueOf(num));
            }
        }

        for (String word : words) {
            if (Collections.frequency(words, word) != 1 ) {
                wordsSort.add(Collections.frequency(words, word));
            }
        }
        System.out.println("Задание №1 " + numEven);
        System.out.print("Задание №2 " + numberOdd);
        System.out.print("\nЗадание №3 " + wordsSort);
//        System.out.println(word + " " + Collections.frequency(words, word));
//        System.out.println("\nч" + even);
//        System.out.println("н" + odd);
//        System.out.print("нечетные " + numberEven);
//        System.out.println("  ");
    }
}