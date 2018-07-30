import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        int length = 1;
        int maxLength = 1;
        int startElement = 0;
        int startPosition = 0;

        for (int i = 0; i < numbers.length - 1; i++) {

            int currentNumber = numbers[i];
            int nextNumber = numbers[i + 1];

            if (currentNumber < nextNumber) {

                length++;

                if (length > maxLength) {

                    maxLength = length;
                    startElement = startPosition;
                }
            } else {
                length = 1;
                startPosition = i + 1;
            }
        }

        for (int i = startElement; i < startElement + maxLength; i++) {

            System.out.print(numbers[i] + " ");
        }

    }
}