import java.util.ArrayList;

public class WrappersExamples {

    public static void main(String[] args) {

        int a = 1;
        Integer b = 1; // wrapper Po co to robić??? Bo do b mam więcej opcji dzięki temu niż do a

        b.toString();

        String c = b.toString();

        System.out.println(b + "vvvv");

        String text = "12345";
        System.out.println(Integer.parseInt(text) + 1);

        double price = 24.50;
        Double price2 = 24.50;

        System.out.println(price2.intValue()); // zamonieł dobla w integra

        boolean isSunny = true;
        Boolean isSunny2 = true;

        ArrayList<Integer> studentList = new ArrayList();    //lista. między <> wpisujemy typ danych, int nie może być, ale Integer czyli wrapper tak.
        studentList.add(1);
        studentList.add(200);

        System.out.println(studentList.toString());
    }

}
