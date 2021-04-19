package pracaDomowa;

import java.util.Scanner;

public class PracaDomowa {

//    1) Stwórz tablicę z różnymi liczbami (dowolnymi). Pobierz jako argument,
//    przekazywany przy uruchomieniu aplikacji, numer z zakresu wielkości tablicy.
//    Sprawdź czy liczba występująca na danym miejscu jest parzysta. Zwróć odpowiednią informację.

    public static void main(String[] args) {

        System.out.println("Podaj index elementu do wyświetlenia?");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();


        int[] tablica = {1,2,3,4,5,6,7,8,9};

//        int a = tablica[3];

        if(a >= 0 && a < tablica.length){

            System.out.println("Wewnątrz zakresu tablicy");
            System.out.println("Wartość elementu to " + a);
            System.out.println("Czy " + a + " jest liczbą parzystą?");
            System.out.println(a%2 == 0);


        }
        else
        {
            System.out.println("Poza zakresem tablicy");
        }






// albo

//        System.out.println(a % 2 == 0);

// 2) Pobierz od użytkownika numer miesiąca i wypisz jego nazwę.

        int month = 11;

        switch (month)
        {
            case 1:
                System.out.println("Ten miesiąc to styczeń");
                break;
            case 2:
                System.out.println("Ten miesiąc to luty");
                break;
            case 3:
                System.out.println("Ten miesiąc to marzec");
                break;
            case 4:
                System.out.println("Ten miesiąc to kwiecień");
                break;
            case 5:
                System.out.println("Ten miesiąc to maj");
                break;
            case 6:
                System.out.println("Ten miesiąc to czerwiec");
                break;
            case 7:
                System.out.println("Ten miesiąc to lipiec");
                break;
            case 8:
                System.out.println("Ten miesiąc to sierpień");
                break;
            case 9:
                System.out.println("Ten miesiąc to wrzesień");
                break;
            case 10:
                System.out.println("Ten miesiąc to październik");
                break;
            case 11:
                System.out.println("Ten miesiąc to listopad");
                break;
            case 12:
                System.out.println("Ten miesiąc to grudzień");
                break;
            default:
                System.out.println("Wprowadź poprawną wartość miesiąca");

        }


    }
}
