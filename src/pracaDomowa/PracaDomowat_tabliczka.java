package pracaDomowa;

public class PracaDomowat_tabliczka {

    public static void main(String[] args) {

        mnozenie();
    }

    public static void mnozenie() {

        int[] tab;
        tab = new int[100];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tab[i] = i * j;
                System.out.println(i + " * " + j + " = " + tab[i]);
            }

            }

        }

    }

