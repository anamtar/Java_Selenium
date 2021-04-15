import javax.swing.*;

public class StringComparisonExamples {

    public static void main(String[] args) {

    }

//    public static void main(String[] args) {

//        String name = "Jacek";
//        String sameName = "Jacek";
//        String smallName = "jacek";
//        String name2 = "Tomasz";
//        String sameName2 = new String("Jacek");
//
//        System.out.println(name.concat(name2));
//        System.out.println(name.contains("cek")); // sprawdz czy string zawiera jakiś day fragment, ale tylko 1
//
//
//        System.out.printf("%s | %s | %b", name, sameName, name == sameName);
//        System.out.printf("\n%s | %s | %b", name, smallName, name == smallName);
//        System.out.printf("\n%s | %s | %b", name, sameName2, name == sameName2);
//        System.out.printf("\n%s | %s | %b", name, sameName2, name.equals(sameName2)); // to jest prefereowane do pórywnywania strongow
//        System.out.printf("\n%s | %s | %b", name, smallName, name.equals(smallName));
//        System.out.printf("\n%s | %s | %b", name, smallName, name.equalsIgnoreCase(smallName)); // metoda ignoruje wielkość znaków
//        System.out.println("\nMam na imię Adam" + " i mam " + 28 + "lat" + "Wyni działania 2 + 2 to: " + 2 + 2);
//        System.out.println(2 + 4 + " równa się: " + 4); // sout dodaje liczby dopóki nie trafi na text w ""

        Boolean isBig(int someNumber){
            return someNumber > 100;

            }

            boolean metoda(char a){

            return Character.isDigit(a);




    }
}