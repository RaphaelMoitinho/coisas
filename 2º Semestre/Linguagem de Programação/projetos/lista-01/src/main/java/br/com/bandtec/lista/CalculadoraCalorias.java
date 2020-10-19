
package br.com.bandtec.lista;

import java.util.Scanner;


public class CalculadoraCalorias {
    public static void main(String[] args) {
        /*
        Jorge Abe Estado começou a se exercitar e deseja saber quantas calorias vai perder nos
        exercícios. Crie uma classe Java que:
        a) Seja executável
        b) Solicite ao usuário o tempo, em minutos (valor inteiro) que ele passou se aquecendo
        c) Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios aeróbicos (correr, andar, pedalar etc)
        d) Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios de musculação
        e) Calcule quantas calorias o Jorge perdeu, sendo que: * cada minuto de aquecimento faz perder 12 calorias
        * cada minuto de ex aeróbico faz perder 20 calorias
        * cada minuto de musculação faz perder 25 calorias
        f) Exiba, usando interpolação e apenas valores numéricos inteiros, uma frase como esta: 
        "Olá, Jorge. Você fez um total de X minutos de exercícios e perdeu cerca de Y calorias".
        */
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quanto tempo, em minutos passou se aquecendo?");
        Integer aquecimento = leitor.nextInt();
        
        System.out.println("Quanto tempo em minutos fez exercícios aeróbicos (correr, andar, pedalar etc)?");
        Integer aerobicos = leitor.nextInt();
        
        System.out.println("Quanto tempo em minutos fez exercícios de musculação?");
        Integer musculacao = leitor.nextInt();
        
        
        Integer caloriasAquecimento = aquecimento * 12;
        Integer caloriasAerobico = aerobicos * 20;
        Integer caloriasMusculacao = musculacao * 25;
        
        Integer tempoTotal = aquecimento + aerobicos + musculacao;
        Integer caloriaTotal = caloriasAquecimento + caloriasAerobico + caloriasMusculacao;
       
        
        System.out.println(String.format("Olá, Jorge. Você fez um total de %d  minutos de exercícios e perdeu cerca de %d calorias", tempoTotal, caloriaTotal));
    }
}
