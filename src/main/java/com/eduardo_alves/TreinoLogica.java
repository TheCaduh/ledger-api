package com.eduardo_alves;

public class TreinoLogica {
    public static void main(String[] args) {
        double[] transacoesDoDia = {50.0, -20.0, 150.0, -10.0, -5.0};

        double saldo = 0.0;
        for (double transacao : transacoesDoDia) {
            saldo = saldo + transacao;
        }
        System.out.println("Saldo final: R$ " + saldo);
    }
}
