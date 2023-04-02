import java.util.*;


public class Main {


    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> nums = generate(10);
        System.out.println("Сгенерированные числа " + nums);
        task1(nums);
        task2(nums);
    }
    private static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(8));
        }

        return list;
    }

    private static void task1(List<Integer> nums) {
        System.out.println("ЗАДАЧА №1");
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        System.out.println("==================================================");
    }

    private static void task2(List<Integer> nums) {
        System.out.println("ЗАДАЧА №2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        System.out.println("==================================================");
    }



}