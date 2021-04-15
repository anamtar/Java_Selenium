public class Arrays {

    public static void main(String[] args) {

        int[] tab = new int[5];
        System.out.println(tab.length);

        int[] tab2 = {2, 10, -1, 3};

        showTable(tab);
        showTable(tab2);

        for (int x : tab2) {
            System.out.println(x);
        }
    }
    public static void showTable(int[] tab){
            System.out.println("Rozmiar tablicy = " + tab.length);
            for (int x: tab
            ){
                System.out.println(x);
            }
        }

    }

//    Stwórz tablicę z różnymi liczbami (dowolnymi). Pobierz jako argument, przekazywany przy
//            uruchomieniu aplikacji, numer z zakresu wielkości tablicy. Sprawdź czy liczba występująca
//            na danym miejscu jest parzysta. Zwróć odpowiednią informację.




