public class StarBVC {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 18; j++) {
                if ((j == 1) || (i == 1 && j <= 4) || (i == 3 && j <= 4) || (i == 5 && j <= 4) || (i == 4 && j == 5)
                        || (i == 2 && j == 5) || (j == 7 && i < 4) || (j == 11 && i < 4) || (i == 5 && j == 9)
                        || (i == 4 && (j == 8 || j == 10)) ||
                        ((i > 1 && i < 5) && j == 13) || (i == 1 && (j > 13)) || (i == 5 && (j > 13))) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}