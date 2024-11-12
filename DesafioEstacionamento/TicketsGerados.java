package DesafioEstacionamento;

import java.util.ArrayList;

public class TicketsGerados {

    int ticket;
    double valor = 7.00;
    boolean pago = false;
    double saldo = 0;

    TicketsGerados(int ticket, double valor, boolean pago){
        this.ticket = ticket;
        this.valor = valor;
        this.pago = pago;
    }

    TicketsGerados(int ticket, boolean pago){
        this.ticket = ticket;
        this.valor = valor;
        this.pago = pago;
    }


}
