package pracaDomowa;

public class PracaDomowaWebinar3 {

    public static void main(String[] args) {

        System.out.println("calculateAverageAge");
        System.out.println(calculateAverageAge(22, 33, 44));
        System.out.println("calculateAverageAge1");
        System.out.println(calculateAverageAge1(33, 44, 53));
        System.out.println("calculateAverageAge2");
        System.out.println(calculateAverageAge2(44.5f, 22.3f, 67.1f));
        System.out.println("calculateAverageAge3");
        System.out.println(calculateAverageAge3(11.2f, 33.1f, 44.4f));



    }

    public static int calculateAverageAge(int a1, int a2, int a3) {

        return (a1 + a2 + a3) / 3;

    }

    public static float calculateAverageAge1(int a1, int a2, int a3) {

        return (a1 + a2 + a3) / 3;

    }

    public static int calculateAverageAge2(float a1, float a2, float a3) {

        int b1 = (int) a1;
        int b2 = (int) a2;
        int b3 = (int) a3;

        return (b1 + b2 + b3) / 3;
    }
    public static float calculateAverageAge3(float a1, float a2, float a3){

        return (a1 + a2 + a3) / 3;

    }
}
