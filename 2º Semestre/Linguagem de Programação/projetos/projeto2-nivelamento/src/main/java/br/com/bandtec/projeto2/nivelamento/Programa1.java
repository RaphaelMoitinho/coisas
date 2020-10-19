
package br.com.bandtec.projeto2.nivelamento;


public class Programa1 {
    public static void main(String[] args){
        
        // Java utiliza tipagem ESTATICA.
        // Javascript utiliza tipagem DINAMICA.
        
        //Variaveis de texto.
        String nome = "Raphael";
        String cidade = "Taboão da Serra";
        String trabalha = "C6 Bank";
        
        // Numeros inteiros. Integer
        
        Integer idade = 25;
        Integer nascimento = 1995;      
        
        // Numeros reais ex: 25.29999999...
        Double preço = 4.40;
        Double temperatura = 22.2;
        
        // Variaveis logicas ex: 0 e 1 (verdadeiro ou falso).
        Boolean ligado = true;
        Boolean aluno = true;
        Boolean solteiro = false;
        
        //Convertendo texto para numero (inteiro).
        String numeroInteiroTxt = "25";
        
        Integer numeroConvertido = Integer.valueOf(numeroInteiroTxt);
        
        //Convertendo texto em numero (real).
        String numeroRealTxt = "25.6";
        
        Double numeroRealConvertido = Double.valueOf(numeroRealTxt);
        
        
        
    }
}
