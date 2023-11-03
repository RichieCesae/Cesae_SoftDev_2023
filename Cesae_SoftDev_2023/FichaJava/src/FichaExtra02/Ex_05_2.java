package FichaExtra02;

public class Ex_05_2 {

    public static void main(String[] args) {

        int starLimit=0, spaceLimit=0, lineLimite=5;

        for (int lines = 0; lines <= lineLimite; lines++) {
            for (int space =lineLimite; space >=spaceLimit;space--){
                System.out.print(" ");
            }
            spaceLimit++;
            for (int star = 1; star < starLimit; star=star+1) {
                System.out.print(lines);
            }
            for (int space =lineLimite; space >=spaceLimit;space--){
                System.out.print(" ");
            }
            System.out.println("");
            starLimit=starLimit+2;
        }

    }

}
