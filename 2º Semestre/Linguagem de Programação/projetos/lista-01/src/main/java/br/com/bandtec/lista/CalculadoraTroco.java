
package br.com.bandtec.lista;

import java.util.Scanner;


public class CalculadoraTroco {
    public static void main(String[] args) {
        /*
        Crie uma classe chamada “CalculadoraTroco” Java que:
        A. Seja executável. 
        B. Solicite o valor unitário de um produto. 
        C. Solicite a quantidade vendida. 
        D. Solicite o valor pago pelo cliente. 
        E. Calcule e exiba o troco com a seguinte frase. "Seu troco será de R$ X"
        */
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual  valor unitário do produto?");
        Double valorUni = leitor.nextDouble();
        System.out.println("Qual a quantidade vendida?");
        Integer quantidade = leitor.nextInt();
        System.out.println("Qual o valor pago pelo cliente?");
        Double valorPago = leitor.nextDouble();
        
        Double valorTotal = valorUni*quantidade;
        Double valorTroco = valorPago-valorTotal;
        
        System.out.println(String.format("Seu troco será de R$%.2f", valorTroco));
        
    }
}
