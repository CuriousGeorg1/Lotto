import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        int amount = 0;
        int upperBound = 0;

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("How many lotterynumber do you need? ");
            amount = Integer.valueOf(reader.nextLine());
            System.out.print("Enter the upper bound limit: ");
            upperBound = Integer.valueOf(reader.nextLine());
        } catch (Exception e) {
            System.out.print("Expected an integer");
            return;
        }
        ArrayList<Integer> result = lotteryNumbers(amount, upperBound);
        System.out.print(result);

    }

    public static ArrayList<Integer> lotteryNumbers(int x, int j) {
        // Create as many lottery numbers(x) as requested with the upper bound limit(j)
        // given
        Random lottery = new Random();
        // Create an ArrayList for generated lottery numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Create random numbers until 7 unique integers has been added to the list
        while (numbers.size() < x) {
            // Integer between [0,j]
            int number = lottery.nextInt(j);
            if (numbers.contains(number)) {
                continue;
            } else {
                numbers.add(number);
            }
        }
        // Retrun list
        return numbers;
    }
}
