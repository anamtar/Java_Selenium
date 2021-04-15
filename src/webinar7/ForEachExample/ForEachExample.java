package webinar7.ForEachExample;

public class ForEachExample {

    public static void main(String[] args) {

        String[] names ={"Adam", "Ewa", "Ola", "Tomek"};

        for (String name: names) {
            System.out.println("Cześć " + name);
        }

        System.out.println("");
        for(int i = 0; i<names.length; i++){
            System.out.println("Cześć " + names[i] + "Twój numer to " + i);
            System.out.printf("Cześć %s Twój numer to %d\n", names[i], i);
        }
        }


    }
