package pracaDomowa;

public class PhoneBook {

    public static void main(String[] args) {

        printContractCard();
        System.out.println("------------------");
        printContact(3, "Adam", "Nowak", 434322323, 23);
        System.out.println("------------------");
        System.out.println(getContact(4, "Artur", "Iksiński", 23423232));
    }

    public static void printContractCard(){

        int id = 0;
        String name = "Imię";
        String surname = "Nazwisko";
        String phoneNumber = "123456789";
        int age = 20;
        String contact = "";
        boolean isHidden = false;

        System.out.println("Id: " + id + "\nImię: " + name + "\nNazwisko: " + surname + "\nWiek: " + age + "\nNumer telefonu: " + phoneNumber);

    }

    public static void printContact(int id, String name, String surname, int phoneNumber, int age){

        String a1 = Integer.toString(id);
        String a2 = Integer.toString(phoneNumber);
        String a3 = Integer.toString(age);


        System.out.println(a1 + " | " + name + " | " + surname + " | " + a2 + " | " + a3);

    }

    public static String getContact(int id, String name, String surname, int phoneNumber){

        return id + " | " + name + " | " + surname + " | " + phoneNumber;
    }

}
