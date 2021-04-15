public class CharacterExamples {

    public static void main(StringExamples[] args) {

        char small = 'a';
        char big = 'A';
        char num = '1';
        Character small2 = 'A';

        System.out.println(Character.isUpperCase(small));
        System.out.println(Character.isUpperCase(big));
        System.out.println(Character.isLowerCase(small));
        System.out.println(Character.isLowerCase(big));
        System.out.println(Character.isDigit(small));
        System.out.println(Character.isDigit(num));

        System.out.println(small2.charValue() == small);
        System.out.println(small2.equals(small));
        System.out.println(small2.compareTo(big));
        System.out.println(small2.compareTo(small));
    }
}
