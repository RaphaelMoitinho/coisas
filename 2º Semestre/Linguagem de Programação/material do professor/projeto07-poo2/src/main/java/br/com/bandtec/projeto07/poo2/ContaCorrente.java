package br.com.bandtec.projeto07.poo2;

public class ContaCorrente {

    private Double saldo = 0.0;
    private String situacao = "";
    private String cor = "#000";

    void depositar20() {
        if ((saldo + 20) <= 600) {
            saldo += 20;
            verificarSituacao();
        }
    }

    void sacar20() {
        if ((saldo - 20) >= -200) {
            saldo -= 20;
            verificarSituacao();
        }
    }

    void verificarSituacao() {
        if (saldo < 0) {
            situacao = "Péssima";
            cor = "#AA0000";
        } else if (saldo >= 0 && saldo < 400) {
            situacao = "Controlada";
            cor = "#0000AA";
        } else {
            situacao = "Rei do camarote";
            cor = "#00AA00";
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getCor() {
        return cor;
    }
}
