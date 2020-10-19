
package br.com.bandtec.projeto2.nivelamento;

public class Programa3 {
    public static void main(String[] args) {
        String nome = "Raphael";
        Integer idade = 25;
        Double bilheteUnico = 225.60;
       
        System.err.println(nome + " tem " + idade + " anos e possui "+ 
                bilheteUnico + " reais em seu bilhete unico.");
        
        //Interpolação de String.
        //Sempre usar String.format("texto", args). 
        
        String frase = String.format("%s tem %d anos e possue %.2f em reais em seu Bilhete Unico", nome, idade, bilheteUnico);
        
        System.err.println(frase);
        
        // %s identifica a String.
        // %d identifica um Integer.
        // %.xf onde x identifica o numero de casas após a virgula e o f identifica Double.
        
        
      
    }
}
