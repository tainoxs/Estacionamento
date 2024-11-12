package DesafioEstacionamento;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner pay = new Scanner(System.in);
        Estacionamento shopping = new Estacionamento();
        int sys = 0;
        System.out.println("\n\nOLÁ ESSE É O SISTEMA DE ESTACIONAMENTO DO SHOPPING!\n TAXA FIXA: R$7\n CADA HORA: R$3");

        while (sys != 6){
            System.out.print("\n\nDigite: \n 1- Gerar ticket\n 2- Ver tickets e status\n 3- Pagar ticket\n 4- Adicionar tempo em hora (simular)\n 5- Ver saldo\n 6- Encerrar programa\n    ");
            sys = entrada.nextInt();

            //-------------------------------------------------------------------------------------------------

            if (sys == 1){
                shopping.gerarTicket();
            } else if (sys != 2 && sys != 3 && sys != 4 && sys != 5 && sys != 6) {
                System.out.println("   DIGITE UM NUMERO VÁLIDO!");
            }

            //-------------------------------------------------------------------------------------------------

            if (sys == 2){
                shopping.verTicketsGerados();
            }else if (sys != 1 && sys != 3 && sys != 4 && sys != 5 && sys != 6) {
                System.out.println("   DIGITE UM NUMERO VÁLIDO!");

            }

            //-------------------------------------------------------------------------------------------------

            if (sys == 3){
                int pagar = 0;
                shopping.verTicketsGeradosSemValor();
                System.out.print("\n   Digite o número do ticket que deseja pagar:\n   ");
                shopping.pagarTicket(pay.nextInt());
            }else if (sys != 2 && sys != 1 && sys != 4 && sys != 5 && sys != 6) {
                System.out.println("   DIGITE UM NUMERO VÁLIDO!");

            }

            //-------------------------------------------------------------------------------------------------

            if (sys == 4){
                int tempo = 0;
                System.out.print("    Digite o tempo em horas que deseja passar:\n    ");
                tempo = pay.nextInt();
                shopping.adicionarTempo(tempo);
            }

            //-------------------------------------------------------------------------------------------------

            if (sys == 5){
                shopping.verSaldo();
            }else if (sys != 2 && sys != 3 && sys != 1 && sys != 4 && sys != 6) {
                System.out.println("   DIGITE UM NUMERO VÁLIDO!");
            }

            //-------------------------------------------------------------------------------------------------

            if (sys == 6){
                break;
            }else if (sys != 2 && sys != 3 && sys != 1 && sys != 4 && sys != 5 ) {
                System.out.println("   DIGITE UM NUMERO VÁLIDO!");
            }
            //-------------------------------------------------------------------------------------------------

        }
        System.out.println("---- PROGRAMA FINALIZADO ----");
        entrada.close();





    }
}
