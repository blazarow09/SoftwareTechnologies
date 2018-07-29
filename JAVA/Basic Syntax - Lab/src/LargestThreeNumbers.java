import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class LargestThreeNumbers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                        .limit(3)
                        .forEach(System.out::println);
    }
}
