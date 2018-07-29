import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int decNum = Integer.parseInt(scanner.nextLine());

        String hex = Integer.toHexString(decNum);
        String bin = Integer.toBinaryString(decNum);

        System.out.println(hex.toUpperCase());
        System.out.println(bin);

    }
}
