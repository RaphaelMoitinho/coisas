package br.com.bandtec.lista3;

import java.util.concurrent.ThreadLocalRandom;


public class Componentes {
    private Integer valorDado1;
    private Integer valorDado2;
    private Integer pontosDado1;
    private Integer pontosDado2;
    private String placarDado1;
    private String placarDado2;
    private String placar;
    
    public void jogarDado() {
        this.valorDado1 = ThreadLocalRandom.current().nextInt(1, 6);
        this.valorDado2 = ThreadLocalRandom.current().nextInt(1, 6);
    }
       
    public void dadoVencedor() {
        if (this.valorDado1 > this.valorDado2) {
            this.placar = ("O diadinho 1 vanceu");
            
        }
        if (this.valorDado1 < this.valorDado2) {
            this.placar = ("O dadinho 2 venceu");
        }
        else {
            this.placar = ("Empate");
        }
    }
    
    public void quantidadesDeVitorias() {
         if (this.valorDado1 > this.valorDado2) {
            this.pontosDado1 ++;
            this.placarDado1 = (String.format("Vitorias do Dadinho1: %d", pontosDado1));           
        }
        if (this.valorDado1 < this.valorDado2) {
            this.pontosDado2 ++;
            this. placarDado2 = (String.format("Vitorias do Dadinho2: %d", pontosDado2));
        }
    }
    
    
}
