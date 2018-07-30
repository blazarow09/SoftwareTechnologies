import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean isTrue = Boolean.parseBoolean(scan.nextLine());

        System.out.println(isTrue ? "Yes" : "No");

    }
}
