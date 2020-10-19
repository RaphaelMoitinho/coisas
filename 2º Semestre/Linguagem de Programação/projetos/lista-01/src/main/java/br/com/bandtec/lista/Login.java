
package br.com.bandtec.lista;

import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        /*
        Crie uma classe Java que:
        a) Seja executável
        b) Solicite o login do cliente
        c) Solicite a senha do cliente
        d) Solicite a quantidade de vezes que o usuário aceita errar a senha antes do bloqueio
        e) Exiba uma frase como esta: "Seu login é L e sua senha é S. Você tem T tentativas antes de ser bloqueado" Use interpolação.
        */
        
        Scanner leitorTexto = new Scanner (System.in);
        Scanner leitorNumero = new Scanner (System.in);
        
        System.out.println("Informe o ligin:");
        String login = leitorTexto.nextLine();
        
        System.out.println("Informe a senha:");
        String senha = leitorTexto.nextLine();
        
        System.out.println("Quantas vezes você aceita errar antes que a senha seja bloqueada?");
        Integer tolerancia = leitorNumero.nextInt();
        
        System.out.println(String.format("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado.", login, senha, tolerancia));
    }
}
