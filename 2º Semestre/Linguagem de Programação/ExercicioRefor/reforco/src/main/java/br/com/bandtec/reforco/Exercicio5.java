package br.com.bandtec.reforco;

import java.util.Scanner;


public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner leior = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        Integer numeroDigitado = leior.nextInt();
        
        while (numeroDigitado < 1) {            
           System.out.println("Digite um numero:"); 
            numeroDigitado = leior.nextInt();
        }
       
        contagemRegressiva(numeroDigitado);
   }
    
    public static void contagemRegressiva(Integer assinaturaDoMetodo) {
        
        
        
        for (Integer i = ; i < 10; i--) {
            
        }
    }
}
