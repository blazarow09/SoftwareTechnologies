import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbol = scanner.nextLine();
        String vowels = "aeiouy";
        String res = "";

        if (vowels.contains(symbol)){
            res = "vowel";
        }else if (Character.isDigit(symbol.charAt(0))) {
            res = "digit";
        }else {
            res = "other";
        }
        System.out.println(res);
    }
}
