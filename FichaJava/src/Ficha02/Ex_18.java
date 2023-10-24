package Ficha02;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {

        //instanciar scanner
        Scanner input = new Scanner(System.in);

        double Salariol, Salariob,SubA, IRS, SegSoc;
        int Dias, cod;

        //ler codigo de trabalhador
        System.out.print("Digite o seu código:");
        cod = input.nextInt();

        //ler dias de trabalho
        System.out.print("Quantos dias trabalhou?   R:");
        Dias = input.nextInt();

        System.out.println("SELECIONE UMA DAS OPÇÕES");
        System.out.println("A.Administrador | C.Chefe | E.Empregado |");

        String opcao;
        opcao = input.next();
        switch (opcao) {
            case "A":
                Salariob = Dias*80;
                System.out.println("O valor ilíquido a receber fruto do vencimento será: " + Salariob + "€");
                SubA = 7.5 *Dias;
                System.out.println("Total subsídio de alimentação: " + SubA + "€");
                if (Salariob > 1000){
                    IRS = 0.2* Salariob;
                }else{
                    IRS = 0.1* Salariob;
                }
                System.out.println("Valor a pagar de IRS: " + IRS);
                SegSoc = 0.09*Salariob + 0.21*Salariob;
                System.out.println("Total a pagar à segurança social: " + SegSoc + "€");
                Salariol= SubA + Salariob - IRS - SegSoc;
                System.out.println("O Funcionário leva para casa: : " + Salariol + "€");

                break;

            case "C":
                Salariob = Dias*60;
                System.out.println("O valor ilíquido a receber fruto do vencimento será: " + Salariob + "€");
                SubA = 7.5 *Dias;
                System.out.println("Total subsídio de alimentação: " + SubA + "€");
                if (Salariob > 1000){
                    IRS = 0.2* Salariob;
                }else{
                    IRS = 0.1* Salariob;
                }
                System.out.println("Valor a pagar de IRS: " + IRS);
                SegSoc = 0.11*Salariob + 0.2375*Salariob;
                System.out.println("Total a pagar à segurança social: " + SegSoc + "€");
                Salariol= SubA + Salariob - IRS - SegSoc;
                System.out.println("O Funcionário leva para casa: : " + Salariol + "€");

                break;

            case "E":
                Salariob = Dias*40;
                System.out.println("O valor ilíquido a receber fruto do vencimento será: " + Salariob + "€");
                SubA = 5 *Dias;
                System.out.println("Total subsídio de alimentação: " + SubA + "€");
                if (Salariob > 1000){
                    IRS = 0.2* Salariob;
                }else{
                    IRS = 0.1* Salariob;
                }
                System.out.println("Valor a pagar de IRS: " + IRS);
                SegSoc = 0.11*Salariob + 0.2375*Salariob;
                System.out.println("Total a pagar à segurança social: " + SegSoc + "€");
                Salariol= SubA + Salariob - IRS - SegSoc;
                System.out.println("O Funcionário leva para casa: : " + Salariol + "€");

                break;

            default:
                System.out.println("Não introduziu um valor válido.");

        }

    }

}
