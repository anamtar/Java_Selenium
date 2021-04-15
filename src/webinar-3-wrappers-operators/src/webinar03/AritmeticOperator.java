import java.sql.SQLOutput;

public class AritmeticOperator {

    public static void main(String[] args) {
//
//        int a = 4;
//        int b = 1;

        int a = 1, b = 4, c = 10, h = 10;  // wszystko to sa inty

        // + dodawanie

        int d = a + b;
        System.out.println("Suma: " + d);   // konkatenacja

        // - odejmowanie

        d = b - a;

        System.out.println("Różnic: " + d);

        // ++ powiększanie o 1

        d++;
        System.out.println("Postinkrementacja: " + d);

        d = 0;

        ++d;

        // --
        h = h - 1;
        h--;
        System.out.println("Postinkrementacja " + h);

        --h;
        System.out.println("Predekrementacja: " + h);

        // * mnożenie

        int r = a * b;
        double rr = Math.pow(2, 2); // potęgowaie, zawsze musi być doublem

        System.out.println("Iloczyn: " + r + " Potega: " + rr);

        // / dzielenie

        int y = c / b;
        System.out.println("Iloraz: " + y);

        // % modulo

        int u = 5 % 3;
        System.out.println("Modulo: " + u);




    }
}
