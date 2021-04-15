import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.Arrays;

public class ex1_StringExamples {

    public static void main(String[] args) {

        String name = "Adam";
        String surname = "Nowak";
        int age = 24;

        System.out.println(name + surname); //jak poprawić wyświetlanie?

        System.out.println(name + " " + surname);

        System.out.printf("%s %s",name,surname);

        //Wyświelt 'Imie: ..., Nazwisko: ..., wiek: ...'
        System.out.println("\nImię: " + name + ", Nazwisko: " + surname + ", wiek: " + age);

        String aboutAla = String.join(" ", "Ala", "ma", "kota", "gdyby", "nie", "miała", "kota", "miała", "by", "psa");
        System.out.println(aboutAla);

        List<String> numbers = Arrays.asList("000","111","222");
        //Na podstawie listy numbers stwórz i wyświetl String zawierający numer telefonu rozdzielony '-'
        //Temat list zostanie omówiony dokładniej na kolejnych etapach kursu

//        System.out.println(Arrays.toString(numbers.split("-")));

        System.out.println(aboutAla.substring(7,11));
        //Z wykorzystaniem substring wyświetl 'kota'

        System.out.println(aboutAla.replace("kota", "chomika"));
        //podmień wszystkie wystąpienia 'kota' na 'chomika'


    }

}



