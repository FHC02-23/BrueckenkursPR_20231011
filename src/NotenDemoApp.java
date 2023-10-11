public class NotenDemoApp {
    public static void main(String[] args) {

        int erreichtePunkte = 87;

        System.out.println("getNotentext(erreichtePunkte) = " + getNotentext(erreichtePunkte));
        System.out.println("getNotentext(1) = " + getNotentext(1));
        System.out.println("getNotentext(50) = " + getNotentext(50));
        System.out.println("getNotentext(64) = " + getNotentext(64));
        System.out.println("getNotentext(65) = " + getNotentext(65));
        System.out.println("getNotentext(77) = " + getNotentext(77));
        System.out.println("getNotentext(78) = " + getNotentext(78));
        System.out.println("getNotentext(76) = " + getNotentext(76));
    }

    public static String getNotentext(int punkte) {
        if (punkte <= 50) {
            return "Ungenügend";
        }// 51 ... 100
        else if (/*punkte >= 51 && */punkte <= 64) {
            return "Genügend";
        } // 65 ... 100
        else if (punkte <= 77) {
            return "Befriedigend";
        }
        // 78 ... 100
        else if (punkte <= 89) {
            return "Gut";
        } // 90 ... 100
        else {
            return "Sehr Gut";
        }
    }

    public static String getNotentext2(int punkte) {
        if (punkte <= 50) {
            return "Ungenügend"; // return verlässt die Methode an dieser Stelle
        }// 51 ... 100
        if (/*punkte >= 51 && */punkte <= 64) {
            return "Genügend";
        } // 65 ... 100
        if (punkte <= 77) {
            return "Befriedigend";
        }
        // 78 ... 100
        if (punkte <= 89) {
            return "Gut";
        } // 90 ... 100

        return "Sehr Gut";
    }

    public static String getNotentext3(int punkte) {
        if (punkte <= 50)
            return "Ungenügend"; // return verlässt die Methode an dieser Stelle
        if (punkte <= 64)
            return "Genügend"; // Bei einzeiligen Blöcken kann die Klammer entfallen
        if (punkte <= 77)
            return "Befriedigend";
        if (punkte <= 89)
            return "Gut";

        return "Sehr Gut";
    }

    public static String getNotentext4(int punkte) {
        if (punkte >= 89 && punkte <= 100) {
            return "Sehr Gut";
        }
        if (punkte >= 77 && punkte < 89) {
            return "Gut";
        }
        if (punkte >= 65 && punkte < 77) {
            return "Befriedigend";
        }
        if (punkte >= 51 && punkte < 65) {
            return "Genügend";
        }

        return "Ungenügend";
    }

    public static String getNotentext5(int punkte) {
        if (punkte >= 89) {
            return "Sehr Gut";
        }
        if (punkte >= 77) {
            return "Gut";
        }
        if (punkte >= 65) {
            return "Befriedigend";
        }
        if (punkte >= 51) {
            return "Genügend";
        }

        return "Ungenügend";
    }
}
