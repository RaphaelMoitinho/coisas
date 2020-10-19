
package br.com.bandtec.reforco;

import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        Integer numeroDigitado = leitor.nextInt();
        Integer somando = numeroDigitado;
        while (numeroDigitado >= 1) {            
            System.out.println("Boa");
            System.out.println("Agora digite outro:");
            numeroDigitado = leitor.nextInt();
            somando = somando += numeroDigitado ;
        }
        System.out.println(String.format("A soma dos numeros é: %d", somando));
    }
}
