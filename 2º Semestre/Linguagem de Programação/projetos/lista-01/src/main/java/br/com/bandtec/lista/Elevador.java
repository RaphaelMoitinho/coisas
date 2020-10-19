
package br.com.bandtec.lista;

import java.util.Scanner;


public class Elevador {
    public static void main(String[] args) {
        /*
        Crie uma classe chamada “Elevador” Java que:
        A. Seja executável. 
        B. Solicite ao usuário o limite de peso de um elevador (número real). 
        C. Solicite ao usuário o limite de pessoas em um elevador (número inteiro). 
        D. Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real). 
        E. Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real). 
        F. Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real). 
        Ao final, exiba uma frase assim:
        "Entraram 3 pessoas no elevador, no qual cabem X pessoas. 
        O peso total no elevador é de Y, sendo que ele suporta Z". 
        (onde X é o 2º valor lido no programa, Z o 1º e Y é a soma dos pesos das 3 pessoas)
        */
        
        Scanner leitorNum = new Scanner(System.in);
        
        System.out.println("qual o limite de peso do elevador?");
        Double pesoMaxElevador = leitorNum.nextDouble();
        
        System.out.println("Qual o limite de pessoas no elevador");
        Integer pessoasElevador = leitorNum.nextInt();
        
        System.out.println("Qual o peso da 1ª pessoa que entrou no elevador");
        Double peso1 = leitorNum.nextDouble();
        
        System.out.println("Qual o peso da 2ª pessoa que entrou no elevador");
        Double peso2 = leitorNum.nextDouble();
        
        System.out.println("Qual o peso da 3ª pessoa que entrou no elevador");
        Double peso3 = leitorNum.nextDouble();
        
        Double pesoTotal = peso1+peso2+peso3;
        
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. \n"
                + " O peso total no elevador é de %.2f, sendo que ele suporta %.2f.", pessoasElevador, pesoTotal, pesoMaxElevador));
        
       
    }
}
