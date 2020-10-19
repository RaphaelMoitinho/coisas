
package br.com.bandtec.lista;

import java.util.Scanner;


public class CalculadoraSalario {
    public static void main(String[] args) {
        /*
        Crie uma classe chamada “CalculadoraSalario” Java que:
        A. Seja executável. 
        B. Solicite que o usuário digite o seu salário. 
        C. Solicite a porcentagem de imposto que o usuário deverá pagar. 
        D. Exiba o valor do salário líquido. Por exemplo:
        Se o salário for 1000,00, e o imposto for de 20%, o salário líquido será 800,00
        */
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu salário:");
        Double salario = leitor.nextDouble();
        
        System.out.println("Qual a porcentagem de imposto que você deverá pagar?");
        Double imposto = leitor.nextDouble();
        
        Double valorImposto = (imposto/100) * salario;
        Double salarioLiquido = salario - valorImposto;
        
        System.out.println(String.format("Seu salário liquido será de R$%.2f", salarioLiquido));
    }
}
