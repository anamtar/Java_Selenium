package webinar7.LoopExamples;

public class LoopExamples {

    public static void main(String[] args) {
        // pierwsza zmienna zawsze jest i (od iterator) i jest to zmienna sterujaca i
        // najcześciej przyjmuje wartosc 0
        // potem jest warunek, najczęściej inkrementacja
        //a na końcu jest co ma się dziać ze zmienną po każdej iteracji

        int[] numbers = new int[7];

//        for(int i = 0; i<10; i++){   // może też być i+=3
//            System.out.println(i);
//        }

//        for(int i =0; i< numbers.length; i++) {
//            numbers[i] = i+1;
//        }
//        System.out.println(numbers[3]);

        miltiplyTab();

    }

    public static void miltiplyTab(){

        for(int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                System.out.print(i * j + " ");   // tu nie ma println bo ta komenda zawsze dodaje nową linijkę
            }
            System.out.print("\n");
        }

    }
}
