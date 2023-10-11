public class PrimValidationApp {
    public static void main(String[] args) {
        
        int i = 1_000_000_000;
        int number2 = 23423523;

        System.out.println("isPrimNumber(number2) = " + isPrimNumber(number2));
        
        while (i < 1_001_000_000) {

            boolean isPrim = isPrimNumber(i);

            if (isPrim == true) {
                System.out.println(i + " is a prim");
            }
            /*else {
                System.out.println(i + " is NOT a prim");
            }*/
            i++;
        }
    }

    public static boolean isPrimNumber(int numberToValidate) {
        // Schleife von 2 bis 112 (< 113)
        int divisor = 2;
        boolean isPrimNumber = true;
        while (divisor < numberToValidate) {

            int rest = numberToValidate % divisor;
            if (rest == 0) {
                isPrimNumber = false;
                // Abbrechen
                break;
            }

            //System.out.println( primNumber + " modulo " + divisor + " = " + rest);
            divisor++;
        }
        return isPrimNumber;
    }

}
