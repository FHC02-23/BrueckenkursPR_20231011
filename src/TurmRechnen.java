public class TurmRechnen {
    public static void main(String[] args) {

        long number = 29054;

        int i = 2; // Laufvariablen "i" => iterations / iterator // n, l, j
        while (i <= 9) {
            long newNumber = number * i;
            System.out.println(number + " * " + i + " = " + newNumber);
            number = newNumber;
            i++;
        }

        i = 2;
        while (i <= 9) {
            long newNumber = number / i;
            System.out.println(number + " / " + i + " = " + newNumber);
            number = newNumber;
            i++;
        }

    }
}
