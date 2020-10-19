
package br.com.bandtec.lista;

import java.util.Scanner;


public class SalarioLiquido {
    public static void main(String[] args) {
        /*
        Crie uma classe Java que ajude a Maria Fobada a saber quanto será seu salário líquido. 
        a) A classe deve ser executável
        b) O programa solicita o salário bruto
        c) O programa calcula o desconto do INSS, que é sempre de 10% sobre o bruto
        d) O programa calcula o desconto de IR, que é sempre de 20% sobre o bruto
        e) O programa pergunta quanto custa a condução diária só de ida da casa para o trabalho. 
        O desconto de VT é sempre o que o usuário gasta. Assim, calcula-se assim: Valor de
        condução ida x 2 x 22. 
        f) Calcule o salário líquido, que é o bruto menos os descontos de INSS, IR e VT
        g) Exibam, usando interpolação e com os valores numéricos com 2 casas decimais, uma
        frase como esta: "Seu bruto é R$A, tem um total de R$B em descontos e receberá um líquido de R$C"
        */
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu salário bruto:");
        Double salarioBruto = leitor.nextDouble();
        
        System.out.println("Quanto custa a condução diária só de ida da casa para o trabalho?");
        Double conducaoDiariaIda = leitor.nextDouble();
        
        Double descontoInssIr = (salarioBruto / 100) * 30;
        
        Double descontoVt = (conducaoDiariaIda * 22) * 2;
        
        Double descontoTotal = descontoInssIr + descontoVt;
        Double salarioLiquido = salarioBruto - descontoTotal;
        
        System.out.println(String.format("Seu salario bruto é R$%.2f, tem um total de R$%.2f em descontos "
                + "e receberá um líquido de R$%.2f", salarioBruto, descontoTotal,salarioLiquido));
        
        
        
    }
}
