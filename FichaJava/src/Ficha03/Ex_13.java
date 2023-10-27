package Ficha03;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        int n, c=0,m=0,r=0;
        boolean crescente=true;

        System.out.print("Quantos numeros deseja inserir. ");
        n = input.nextInt();

        while (c<n){
            System.out.print("Introduza um número: ");
            m = input.nextInt();
            if(m>r) {
                r = m + r;
                m = r - m;
                r = r - m;
//                t++;
//                System.out.println("t: "+t);
            } else {
                //t = -n;
                crescente=false;
//                System.out.println("t: "+t);
            }
            c++;
        }

        if (crescente == true){
            System.out.println("Crescente.");
        }else {
            System.out.println("Não Crescente. ");
        }

    }

}
