public class WinterreifenDemoApp {
    public static void main(String[] args) {

        System.out.println("isWinterreifenPflicht(3, false) = " + isWinterreifenPflicht(3, false));
        System.out.println("isWinterreifenPflicht(11, false) = " + isWinterreifenPflicht(11, false));
        System.out.println("isWinterreifenPflicht(8, true) = " + isWinterreifenPflicht(8, true));
        System.out.println("isWinterreifenPflicht(15, true) = " + isWinterreifenPflicht(15, true));

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        // Temperatur < 10 && rutschigeFahrbahn
        // Temperatur < 4

        boolean winterreifenPflicht = false;
        if (temperatur < 10 && rutschigeFahrbahn == true) {
            winterreifenPflicht = true;
        }
        else {
            if (temperatur < 4) {
                winterreifenPflicht = true;
            }
        }
        return winterreifenPflicht;
    }

    public static boolean isWinterreifenPflicht2(int temperatur, boolean rutschigeFahrbahn) {
        // Temperatur < 10 && rutschigeFahrbahn
        // Temperatur < 4

        boolean winterreifenPflicht = false;
        if (temperatur < 10 && rutschigeFahrbahn == true) {
            winterreifenPflicht = true;
        }
        if (temperatur < 4) {
            winterreifenPflicht = true;
        }

        return winterreifenPflicht;
    }

    public static boolean isWinterreifenPflicht3(int temperatur, boolean rutschigeFahrbahn) {
        // Temperatur < 10 && rutschigeFahrbahn
        // Temperatur < 4

        boolean winterreifenPflicht = false;
        if ((temperatur < 10 && rutschigeFahrbahn == true) || (temperatur < 4)){
            winterreifenPflicht = true;
        }

        return winterreifenPflicht;
    }

    public static boolean isWinterreifenPflicht4(int temperatur, boolean rutschigeFahrbahn) {
        // Temperatur < 10 && rutschigeFahrbahn
        // Temperatur < 4

        if ((temperatur < 10 && rutschigeFahrbahn == true) || (temperatur < 4)){
            return true; // Methode wird verlassen
        }
        // else
        return false;
    }

    public static boolean isWinterreifenPflicht5(int temperatur, boolean rutschigeFahrbahn) {
        // Temperatur < 10 && rutschigeFahrbahn
        // Temperatur < 4

        return (temperatur < 10 && rutschigeFahrbahn == true) || (temperatur < 4);
    }

    public static boolean isWinterreifenPflicht6(int temperatur, boolean rutschigeFahrbahn) {
        // Temperatur < 10 && rutschigeFahrbahn
        // Temperatur < 4

        return (temperatur < 10 && rutschigeFahrbahn) || (temperatur < 4);
    }
}
