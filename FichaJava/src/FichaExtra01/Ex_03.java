package FichaExtra01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double preco;

        System.out.print("Introduza o preço: ");
        preco = input.nextDouble();

        if (preco>100){
            System.out.println("Preço Final: " + 0.9*preco + "€  (10% de desconto)");
        }else{
            System.out.println("Preço Final: " + preco + "€  Sem desconto");
        }
    }

}
