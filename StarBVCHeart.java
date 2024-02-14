public class StarBVCHeart {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 23; j++) {
                if ((j == 1) || (i == 1 && j <= 4) || (i == 3 && j <= 4) || (i == 5 && j <= 4) || (i == 4 && j == 5)
                        || (i == 2 && j == 5) || (j == 7 && i < 4) || (j == 11 && i < 4) || (i == 5 && j == 9)
                        || (i == 4 && (j == 8 || j == 10)) ||
                        ((i > 1 && i < 5) && j == 13) || (i == 1 && (j > 13 && j < 18))
                        || (i == 5 && (j > 13 && j < 18)) ||
                        (i == 1 && (j == 20 || j == 22)) ||
                        (i == 2 && (j == 19 || j == 23 || j == 21)) ||
                        (i == 3 && (j == 19 || j == 23)) ||
                        (i == 4 && (j == 20 || j == 22)) ||
                        (i == 5 && (j == 21))) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}