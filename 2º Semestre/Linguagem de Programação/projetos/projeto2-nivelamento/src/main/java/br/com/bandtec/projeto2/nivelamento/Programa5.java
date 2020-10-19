package br.com.bandtec.projeto2.nivelamento;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        
        // Um exemplo de como isntanciar um objeto do tipo scanner.
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = leitorTexto.nextLine();
       
        
        System.out.println("Digite sua idade:");
        Integer idade = leitorNumero.nextInt();
        
        System.out.println("Digite sua altura:");
        Double altura = leitorNumero.nextDouble();
        
        System.out.println("Em qual empresa você faz estágio?");
        String empresa = leitorTexto.nextLine();
        
         
        System.out.println(String.format("Olá %s", nome));
        System.out.println(String.format("Você tem %d anos", idade));
        System.out.println(String.format("Você tem %.2f altura", altura));
        if (idade >= 18) {
            System.err.println(String.format("%s você já é maior de idade e ja pode tirar sua CNH", nome) );
        }else{
            System.err.println(String.format("%s, você ainda não é maior de idade, continue de metrô", nome));
        }
        System.out.println(String.format("E assim poderá chegar até o(a) %s", empresa));
    }
}
