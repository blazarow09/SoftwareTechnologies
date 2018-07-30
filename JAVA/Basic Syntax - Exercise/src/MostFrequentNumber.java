import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine()
                .split(" ");
        int maxCount = 0;

        String mostFrequentEl = elements[0];

        for (int i = 0; i < elements.length; i++){
            int count = 1;

            for (int j = i + 1; j < elements.length; j++){
                if (elements[i].equals(elements[j])){
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequentEl = elements[i];
            }
        }
        System.out.println(mostFrequentEl);
    }
}
