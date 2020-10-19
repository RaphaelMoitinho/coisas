
package br.com.bandtec.lista;

import java.util.Scanner;


public class Idade {
    public static void main(String[] args) {
        /*
        Crie uma classe chamada “Idade” Java que:
        A. Seja executável. 
        B. Solicite que o usuário digite o seu nome. 
        C. Em seguida, o programa deverá exibir a mensagem: “Olá, Fulano! 
        Qual o ano de seu nascimento?”. 
        D. Depois, o programa deverá exibir: “Em 2030 você terá 25 anos” 
        (sendo Fulano o nome digitado pelo usuário e xx a idade
        do usuário). 
        Exemplo:
        Qual é o seu nome?
        Maria
        Olá, Maria! 
        Qual o ano de seu nascimento?
        1995
        Em 2030 você terá 35 anos.
        */
        Scanner leitorText = new Scanner (System.in);
        Scanner leitorNum = new Scanner (System.in);
        
        System.out.println("Digite deu nome:");
        String nome = leitorText.nextLine();
        System.err.println(String.format("Olá %s", nome));
        
        System.err.println("Qual o ano de seu nascimento?");
        Integer anoNasc = leitorNum.nextInt();
                
        Integer idadeFutura = 2030 - anoNasc;
        
        System.err.println(String.format("Em 2030 você terá %d anos", idadeFutura));
        
    }
}
