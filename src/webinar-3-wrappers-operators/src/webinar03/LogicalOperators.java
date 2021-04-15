public class LogicalOperators {

    public static void main(String[] args) {

        int a = 15, b = 20, k = 0;

        boolean result = b > a && k < b;    // koniunkcja
        System.out.println(result);

        result =b != a || k > b; // alternatywa

        System.out.println(result);

    }
}
