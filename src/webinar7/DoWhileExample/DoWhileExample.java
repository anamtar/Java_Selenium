package webinar7.DoWhileExample;

public class DoWhileExample {

    public static void main(String[] args) {
        int i = 7;
        do{                                             // do zawsze wykona pętlę pierwszy raz, a dopiero potem sprawdzi warunek
            System.out.println("Twój numer to " + i);
            i++;
        } while (i<5);

        int j = 7;
        while(j<5){
            System.out.println("WHILE - Twój numer to " + j);
            j++;
        }
    }
}
