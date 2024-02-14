public class StarHeart {
    public static void main(String args[]) {
        // System.out.println("23225A4502 ");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((i == 1 && (j == 2 || j == 3 || j == 7 || j == 8)) ||
                        (i == 2 && (j == 1 || j == 4 || j == 6 || j == 9)) ||
                        (i == 3 && (j == 1 || j == 5 || j == 9)) ||
                        (i == 4 && (j == 1 || j == 9)) ||
                        (i == 5 && (j == 2 || j == 8)) ||
                        (i == 6 && (j == 3 || j == 7)) ||
                        (i == 7 && (j == 5))) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}