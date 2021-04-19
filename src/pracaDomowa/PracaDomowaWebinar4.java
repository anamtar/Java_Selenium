package pracaDomowa;

public class PracaDomowaWebinar4 {

    public static void main(String[] args) {

    Kontakt nowy = new Kontakt(1, "Józek", "Nowak", 23, 232323232);

    nowy.printContactCard();

    }

}

    class Kontakt
    {
        private int id;
        private int age;
        private int phoneNumber;
        private String name;
        private String nazwisko;

        public Kontakt(int id, String name, String nazwisko, int age, int phoneNumber)
        {
            this.id = id;
            this.name = name;
            this.nazwisko = nazwisko;
            this.age = age;
            this.phoneNumber = phoneNumber;
        }
        void printContactCard(String kontakt)
        {

        }
    }


