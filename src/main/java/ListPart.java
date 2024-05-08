import java.util.*;

public class ListPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry X:");
        int X = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Entry numbers:");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        partitionList(numbers, X);

        System.out.println("Переставленный список: " + numbers);
    }

    public static void partitionList(List<Integer> numbers, int X) {
        int i = 0;
        int j = numbers.size() - 1;

        while (i < j) {
            while (i < j && numbers.get(i) <= X) {
                i++;
            }
            while (i < j && numbers.get(j) > X) {
                j--;
            }
            if (i < j) {
                swap(numbers, i, j);
            }
        }
    }

    private static void swap(List<Integer> numbers, int i, int j) {
        int temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
    }
}
