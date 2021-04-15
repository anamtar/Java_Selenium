import java.util.Arrays;

public class StringExamples {

    public static void main(String[] args) {

        String s1 = "Uczę się Java";
        String s2 = "Uczę się Java";
        String s3 = new String("Uczę się Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String name = "Jacek";
        String surname = "Nowak";

        System.out.println(name + surname); // niezalcane, nie bedzie spacji
        System.out.println(name + " " + surname); //

        System.out.printf("%s %s", name, surname); // formatowany sout

        //%s - tu będzie wstawiony text
        //%d - tu będzie liczba lub cyfra
        //%n - tu będzie wsawiony znak nowej linii
        //%b - tu będzie wartość logicna true lub false

        System.out.printf("%s %s ma %d lat więc jest dorosły: %b %n", name, surname, 28, 28 > 18);

        String joinedString = String.join(" ", name, surname, "ma 28 lat");    // w pierwszym "" znak, który będzie odzielał wartości
        System.out.println(joinedString);

        String text = "Text do podzielenia";
//        int[] numbers = {1, 2, 3, 4, 5};

        String[] stringArray = text.split(" "); // rozdzielenie wg spacji
        System.out.println(Arrays.toString(stringArray));
        System.out.println(text.substring(5)); // od 5 znaku zacznie dzielić
        System.out.println(text.substring(0, 4)); //końcówka nie jest brana pod uwagę
        System.out.println(text.replace("Text", "pieniędze"));
        System.out.println(text.replace("Text", "Pieniądze"));
        System.out.println(text.replaceAll("wyrzucenia", "spalenia"));


//                System.out.println(text.split(" "));
    }
}
