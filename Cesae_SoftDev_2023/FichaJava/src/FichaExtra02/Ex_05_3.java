package FichaExtra02;

public class Ex_05_3 {

    public static void main(String[] args) {

        int nLimit=0, spaceLimit=0, lineLimite=5;

        for (int lines = 1; lines <= lineLimite; lines++) {
            for (int space = lineLimite; space >= spaceLimit; space--) {
                System.out.print(" ");
            }
            spaceLimit++;
            for (int n = 0; n < 1; n = n + 1) {
                System.out.print(lines);
            }
            System.out.println("");
            nLimit = nLimit + 2;
        }

    }

}
