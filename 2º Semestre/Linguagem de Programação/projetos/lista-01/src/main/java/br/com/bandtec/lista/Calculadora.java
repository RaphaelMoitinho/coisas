
package br.com.bandtec.lista;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        /*
        Exercício 01 - Calculadora Simples
        Crie uma classe chamada “Calculadora” Java que:
        A. Seja executável (possui o método main). 
        B. Solicite um número para o usuário(número real). 
        C. Solicite outro número para o usuário(número real). 
        D. Calcule e exiba a soma dos dois números digitados. 
        E. Calcule e exiba a subtração do primeiro número pelo segundo. 
        F. Calcule e exiba a multiplicação do primeiro número pelo segundo. 
        G. Calcule e exiba a divisão do primeiro número pelo segundo. Exemplo:
        Digite um número:
        10
        Digite outro número:
        4
        Resultado da soma:
        14.0
        Resultado da subtração:
        6.0
        Resultado da multiplicação:
        40.0
        Resultado da divisão:
        2.5
        */
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        Double num1 = leitorNumero.nextDouble();
        
        System.out.println("Digite outro:");
        Double num2 = leitorNumero.nextDouble();
        
        Double soma = num1 + num2;
        Double subi = num1 - num2;
        Double mult = num1 * num2;
        Double divi = num1 / num2;
        
        System.out.println(String.format("Resultado da soma é %.2f", soma));
        System.out.println(String.format("Resultado da subtração é %.2f", subi));
        System.err.println(String.format("Resultado da multiplicação é %.2f", mult));
        System.err.println(String.format("Resulltado da divsão é %.2f", divi));
        
        
    }
}
