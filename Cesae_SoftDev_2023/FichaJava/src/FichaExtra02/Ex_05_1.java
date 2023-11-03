package FichaExtra02;

public class Ex_05_1 {

    public static void main(String[] args) {

        int numberLimit=1;

        for (int lines = 0; lines <= 5; lines++) {
            for (int n = 1; n < numberLimit; n++) {
                System.out.print(lines);
            }
            System.out.println("");
            numberLimit++;
        }

    }

}
