
package br.com.bandtec.projeto2.nivelamento;


public class Programa2 {
    public static void main(String[] args) {
        /*
        Operações aritimeticas basicas são as mesmas utilizadas no 
        javascript
        + soma
        - subtração
        * multiplicação
        / divisão
        */ 
        
        String nome = "Raphael";
        Integer passagensDia = 4;
        Double bilheteUnico = 122.90;
        
        // Supondo que a passagem custa 4.40.
        
        Double passagensTotais = bilheteUnico / 4.40;
        
        
        // Convertendo valor real (casas decimais) para inteiro.
        Integer passagensTotaisInteiro = passagensTotais.intValue();
        
        System.out.println("Passagens totais: " + passagensTotaisInteiro);
        
        System.err.println(nome + " pode usar o bilhete sem ter que pedir carona"
                + " por " + (passagensTotaisInteiro/passagensDia) + " dias.");
        
        // \n quebra uma linha. como o <br> no HTML.
        // \t um TAB.
        
        
    }
}
