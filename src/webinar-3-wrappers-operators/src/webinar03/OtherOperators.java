public class OtherOperators {

    public static void main(String[] args) {

        int a = 2, b = 4;

        //Math.max(a, b) // z dóch podanych liczb zwraca większą

        System.out.println(Math.max(a, b));

        int[] tab = {2,3,4,5}; // do takiej tablicy nie mozna dodać kolejnej pozycji przez jakąś komendę, tylko ręcznie
        int[] tab2 = new int [10]; // utwórz tablicę o 10 miejscach
        tab2[0] = 45; //pod ineksem 0 zapisz 45
        tab2[1] = 90; // {45, 90 .... i 8 wolnych miejsc)
        System.out.println(tab.length);


    }

    public static int sum(int a, int b){
        return a + b;
    }
}
