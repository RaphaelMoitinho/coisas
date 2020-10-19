
package br.com.bandtec.reforco;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        
        System.out.println("Olá, qual é seu Nome?");
        String nome = leitorTexto.nextLine();
        
        System.out.println("Qual seu ano de nascimento?");
        Integer ano = leitorNumero.nextInt();
        
        System.out.println("Olá "+ nome + ", em 2030 você terá " + (2030-ano) + " anos");
        System.out.println(String.format("Olá %s, em 2030 você terá %d anos", nome, (2030-ano)));
    }
 
}
 