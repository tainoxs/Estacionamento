package DesafioEstacionamento;

import java.util.ArrayList;
import java.util.Random;

public class Estacionamento {
    TicketsGerados tt;
    private Random aleatorio = new Random();
    ArrayList<TicketsGerados> listaDeTickets = new ArrayList<>();
    double total = 0;

    //-------------------------------------------------------------------------------------------------

    void gerarTicket(){
        int numeroTemp = 1000 + aleatorio.nextInt(999);
        boolean pago = false;
        TicketsGerados novoTicket = new TicketsGerados(numeroTemp, pago);
        this.listaDeTickets.add(novoTicket);
        System.out.println("    Ticket gerado com sucesso!");
    }

    //-------------------------------------------------------------------------------------------------

    void pagarTicket(int numeroDoTicket){
        boolean confirm = false;
        double totalAqui = 0;
        for (TicketsGerados ticket : listaDeTickets) {
            if (ticket.ticket == numeroDoTicket && ticket.pago == false) { // Verifica se o código bate
                ticket.pago = true; // Código encontrado
                System.out.println("   TICKET PAGO!");
                confirm = true;
                totalAqui += ticket.valor;
            }
        }
        if (confirm == true){
            total += totalAqui;
        }else{
            System.out.println("   TICKET INVÁLIDO OU JÁ PAGO");
        }
    }

    //-------------------------------------------------------------------------------------------------

    void verTicketsGerados(){
        for (TicketsGerados tg : listaDeTickets){
            if (!tg.pago){
                System.out.println("    Ticket: " + tg.ticket + ", com valor de: R$" + tg.valor + " não foi pago");
            }
            else{
                System.out.println("    Ticket: " + tg.ticket + " foi pago");
            }
        }
    }

    //-------------------------------------------------------------------------------------------------

    void verTicketsGeradosSemValor(){
        for (TicketsGerados tg : listaDeTickets){
            if (!tg.pago){
                System.out.print("\n    Ticket: " + tg.ticket + "\n     Valor a ser pago: R$"+tg.valor+"\n");
            }
        }
    }

    //-------------------------------------------------------------------------------------------------

    void adicionarTempo(int hora){
        for (TicketsGerados tg : listaDeTickets){
            if (tg.pago == false){
                tg.valor += hora*3;
            }
        }
    }

    //-------------------------------------------------------------------------------------------------

    void verSaldo(){
        System.out.println("    O saldo total é: R$"+ this.total);
    }
}
