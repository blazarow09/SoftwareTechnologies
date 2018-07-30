import java.util.Arrays;
import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++){
            alphabet[i] = (char) ('a' + i);
        }

        String word = scanner.nextLine().toLowerCase();

        for (int j = 0; j < word.length(); j++){
            char currChar = word.charAt(j);
            int currCharIndex = Arrays.binarySearch(alphabet, currChar);

            System.out.println(currChar + " -> " + currCharIndex);
        }
    }
}
