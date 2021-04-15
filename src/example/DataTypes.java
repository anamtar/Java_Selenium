package example;

public class DataTypes {
    public static void main(String[] args) {
        int age; //delaracja zmiennej
        age = 25; // inicjalizacja zmiennej
        int wiek = 22; // deklaracja i inicjalizacja w jednej linii

        age = 30;
        System.out.println(age);

        byte number = 127; // maxymalna wartość byte
        short anotherNumber = 32767; //maxymalna wartość shorta
        long superNumber = 999999999; // maxymalna wartość longa

        float weight = 55.5f; //musi być f/F, żeby ta liczba była floatem
        double height = 180.5; //każda zmiennoprzecinkowa jest domyślnie double

        boolean isPandemic = true;
        boolean isPubOpen = false;  //boolean przyjmuje tylko true lub false

        char sign = '1'; // char przyjmuje wartość tylko jednego znaku
        char signa = 97; // char bez cudzysłowu to wynik z tabeli znaków ASCII

//        komentarz dla całej linijki to crtl + /

        String text = "Hello World!"; //String z dużej litery
        System.out.println(text);
    }
}
