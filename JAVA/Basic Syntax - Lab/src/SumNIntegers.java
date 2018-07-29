import java.util.Scanner;

public class SumNIntegers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < lines; i++){

            int currNum = Integer.parseInt(scan.nextLine());
            sum+= currNum;
        }

        System.out.printf("Sum = %d%n", sum);
    }
}
