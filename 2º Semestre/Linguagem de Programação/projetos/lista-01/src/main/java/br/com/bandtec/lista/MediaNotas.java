
package br.com.bandtec.lista;

import java.util.Scanner;


public class MediaNotas {
    public static void main(String[] args) {
        /*
        Crie uma nova classe (Class) no projeto e:
        a) Ela deve ser executável
        b) Solicite o nome e duas notas ao usuário. As notas são números reais. 
        c) Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
        d) Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA" 
        e) Use Interpolação com 1 casa decimal para a média
        */
        
        Scanner leitorTexto = new Scanner (System.in);
        Scanner leitorNumero = new Scanner (System.in);
        
        System.out.println("Qual é seu nome?");
        String nome = leitorTexto.nextLine();
        
        System.out.println("Informe uma nota:");
        Double nota1 = leitorNumero.nextDouble();
        
        System.out.println("Informe outra nota:");
        Double nota2 = leitorNumero.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("Olá, %s. \nSua média foi de %.2f", nome, media));
    }
}
