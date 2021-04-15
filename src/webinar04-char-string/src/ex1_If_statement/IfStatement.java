public class IfStatement {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(4));

    }

        public static boolean isEvenNumber(int num) {
            if(num % 2 == 0) {
                return true;
            }
            return false;
        }

        public static void printIsEvenNumber(int num) {
            //St
            if(num % 2 == 0) {
                System.out.println("To jest liczba parzysta");
            }

        }
    }
