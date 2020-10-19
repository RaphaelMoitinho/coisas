package br.com.bandtec.reforco;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o numero que você deseja ver a tabuada");
        Integer numeroUsuario = leitorNumero.nextInt();
        Integer tabuada;
        
        for (int i = 0; i <= 10; i++) {
            tabuada = numeroUsuario * i;
            System.err.println(String.format("%d x %d = %d", i, numeroUsuario, tabuada));   
        }
       
    }
}
