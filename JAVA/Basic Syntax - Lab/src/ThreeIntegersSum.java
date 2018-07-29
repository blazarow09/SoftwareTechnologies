import java.util.Arrays;
import java.util.Scanner;

public class ThreeIntegersSum {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstNum = numbers[0];
        int secondNum = numbers[1];
        int thirdNum = numbers[2];

        if (!FindThreeIntSum(firstNum, secondNum, thirdNum)
                && !FindThreeIntSum(firstNum, thirdNum, secondNum)
                &&!FindThreeIntSum(secondNum, thirdNum, firstNum)) {
            System.out.println("No");
        }
    }

    private static boolean FindThreeIntSum(int firstNum,int secondNum, int thirdNum) {

        if (firstNum + secondNum != thirdNum){
            return false;
        }

        int smallNum = Math.min(firstNum, secondNum);
        int bigestNum = Math.max(firstNum, secondNum);

        System.out.printf("%d + %d = %d%n", smallNum, bigestNum, thirdNum);

        return true;
    }

}
