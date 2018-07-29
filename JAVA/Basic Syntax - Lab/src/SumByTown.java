import java.util.Scanner;
import java.util.TreeMap;

public class SumByTown {
    public static void  main(String[] args){

        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        TreeMap<String, Double> townsIncomes = new TreeMap<>();

        for (int i = 0; i < lines; i++){

            String[] tokens = scan.nextLine().split("\\|");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());
            townsIncomes.putIfAbsent(town,0.0);
            townsIncomes.put(town, townsIncomes.get(town) + income);
        }
        townsIncomes.forEach((key,value) -> System.out.println(key + " -> " + value));
    }
}
