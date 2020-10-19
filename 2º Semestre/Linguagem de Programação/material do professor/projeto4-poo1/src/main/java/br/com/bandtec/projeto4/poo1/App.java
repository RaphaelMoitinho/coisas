package br.com.bandtec.projeto4.poo1;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        // Laços de repetiçao
        // Exemplo utilizando o "for"
        for (int i = 0; i <= 10; i++) {
            
            if (i % 2 == 0) {
                System.out.println(String.format("%d e par",
                        i));
            }else{
                System.out.println(String.format("%d e impar",
                        i));
            }
        }

        System.out.println("-".repeat(8));
        
        // Exemplo de while:
        Integer numero = 11;

        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }

        System.out.println("-".repeat(8));
        
        // Exemplo de do...while
        // A principal diferença entre os dois e que esse sempre realiza o procedimento
        // descrito dentro das chaves ao menos uma vez para depois comparar.
        do {            
            System.out.println(numero);
        } while (numero <= 10);

        System.out.println("-".repeat(8));
        
        // Sintaxe de como criar objetos no Java.
        // Nome da classe(forma) a esquerda
        // Nomde do objeto(indiferente)
        // palavra reservada new
        // Nome da classe novamente
        Random aleatorio = new Random();

        System.out.println("-".repeat(8));
        
        // Exemplo de uso da classe Random
        System.out.println(aleatorio.nextInt());
        System.out.println(aleatorio.nextDouble());
        
        // vamos começar utilizando o Integer
        
        // Soteando 20 numeros de 0 a 10
        // Passamos 11 como parametro pois ele contempla o 0
        for (int i = 0; i < 20; i++) {
            System.out.println(aleatorio.nextInt(11));
        }

        System.out.println("-".repeat(8));
        
        //Exemplo de sorteio de numeros aleatorios no range(intervalo) de 100 a 200
        // Enquanto o numero for diferente de 100 ficara sorteando
        // Obs: caso queira testar altere a variavel chute
        Integer chute = 0;

        do {
            
            // 101 posiçoes ou numeros
            // começando do 100
            chute = aleatorio.nextInt(101) + 100;
            System.out.println("Numero gerado: " + chute);
        } while (chute != 200);

        System.out.println("-".repeat(8));
        
        //Zerando a variavel chute para novo teste.
        chute = 0;

        // Exemplo usando o mesmo range (intervalo) so que negativo.
        while (chute != -200) {
            
            //101 posiçoes ou numeros
            // começando a partir do -200
            chute = aleatorio.nextInt(101) - 200;

            System.out.println("Numero negativo gerado: " + chute);
        }

        System.out.println("-".repeat(8));
        
        // Diferente do nextInt(), o nextDouble() nao utiliza o numero de posiçoes como parametro
        // temos que recorrer a multiplicaçao para definir o range =(.
        // Por padrao o nextDouble gera numero no intervalo de 0.x a 1.x,
        // para definirmos o range de 0 a 10 por exemplo, multiplicamos por 11,
        // sendo 11 o range considerando o 0.
        // Podemos pensar que o 11 representa 11 posiçoes começando pelo zero.
        
        // Tanto para numeros inteiros quanto para numeros reais, caso vc queira desconsiderar o 0
        // basta somar mais 1 ao sorteio.
        
        for (int i = 0; i < 10; i++) {
            System.out.println("NUmero real aleatorio positivo: " + aleatorio.nextDouble() * 11);
        }

        System.out.println("-".repeat(8));
        
        // Exemplo com numeros negativos -10 a 0
        for (int i = 0; i < 10; i++) {
            System.out.println("NUmero real aleatorio negativo: " + aleatorio.nextDouble() * -11);
        }
        
        System.out.println("-".repeat(8));
        
        // Exemplo de numero real aleatorio usando while.
        // Realizei a conversao pois e muito dificil/pouco provavel o computador
        // gerar um numero real "cravado" ou "arredondado", ex: 10.00000.
        Double chuteReal = 0.0;
        Integer chuteRealArredondado = 0;
        
        while (chuteRealArredondado != 10) {
            
            // Gera numero aleatorio
            chuteReal = aleatorio.nextDouble() * 11;
            
            // Pegando o valor equivalente em numero inteiro para comparaçao
            chuteRealArredondado = chuteReal.intValue();
            
            System.out.println("Numero real gerado: " + chuteReal);
            System.out.println("Numero real gerado convertido: " + chuteRealArredondado);
        }
        
        System.out.println("-".repeat(8));
        
        // Mesmo exemplo com numeros negativos num range de -110 a 0
        chuteReal = 0.0;
        chuteRealArredondado = 0;
        
        while (chuteRealArredondado != -110) {
            
            // Gera numero aleatorio
            chuteReal = (aleatorio.nextDouble() * 111) -111;
            
            // Pegando o valor equivalente em numero inteiro para comparaçao
            chuteRealArredondado = chuteReal.intValue();
            
            System.out.println("Numero real negativo gerado: " + chuteReal);
            System.out.println("Numero real negativo gerado convertido: " + chuteRealArredondado);
        }
    }
}
