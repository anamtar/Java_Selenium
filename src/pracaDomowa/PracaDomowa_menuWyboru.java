package pracaDomowa;

import java.util.Scanner;

public class PracaDomowa_menuWyboru {

    public static void main(String[] args) {

        menu();
    }

    public static void menu() {

        int i = 1;

        while (i != 0) {
            System.out.println("Wybierz opcję menu: ");
            System.out.println("1 - kurs franka, 2 - kurs dolara, 3 - kurs euro, 0 - koniec ");

            Scanner scan = new Scanner(System.in);
            int menu = scan.nextInt();

            if (menu == 1) {
                System.out.println("4,22");;
                            }
            else if (menu == 2) {
                System.out.println("3,89");

            }
            else if (menu == 3) {
                System.out.println("4,54");

            }
            else if (menu == 0) {
                break;
            }

        }


    }

}

