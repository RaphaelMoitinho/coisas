
package br.com.bandtec.lista;

import java.util.Scanner;


public class BolsaFilhos {
    public static void main(String[] args) {
        /*
        No país “Quisito” existe um benefício social chamado "Bolsa Filhos". Crie uma classe
        Java que:
        a) Solicite ao usuário quantos filhos de 0 a 3 anos possui. 
        b) Solicite ao usuário quantos filhos de 4 a 16 anos possui. 
        c) Solicite ao usuário quantos filhos de 17 a 18 anos possui. 
        d) Calcule o valor da Bolsa, sendo que o governo paga: 
        * R$25,12 por filhos com menos de 4 anos
        * R$15,88 por filhos entre 4 e 16 anos
        * R$12,44 por filhos entre 17 e 18 anos
        e) Exiba uma frase como esta: "Você tem um total de T filhos e vai receber R$B de bolsa" Use interpolação com 2 casas decimais para o valor da bolsa
        */
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos?");
        Integer filhosAte3 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos possui?");
        Integer filhosAte16 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos possui?");
        Integer filhosAte18 = leitor.nextInt();
        
        Double valorBolsaAte3 = filhosAte3 * 25.12;
        Double valorBolsaAte16 = filhosAte16 * 15.88;
        Double valorBolsaAte18 = filhosAte18 * 12.44;
        
        Double totalBolsa = valorBolsaAte3 + valorBolsaAte16 + valorBolsaAte18;
        Integer totalFilhos = filhosAte3 + filhosAte16 + filhosAte18;
        
        System.out.println(String.format("Você tem um total de %s filhos e vai receber R$%.2f de bolsa", totalFilhos, totalBolsa));
        
    }
}
