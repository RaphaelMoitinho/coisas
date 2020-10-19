
package br.com.bandtec.projeto9.poo2;

public class TesteProfessor {
    
    public static void main(String[] args) {
        
        Professor professor1= new Professor("Gerson", 10000.0);
              
        System.out.println(String.format("Cód: %d\n", professor1.getCod()));
        System.out.println(String.format("Nome: %s\n", professor1.getNome()));
        System.out.println(String.format("Salario: %.2f", professor1.getSalario()));
        
    }
}
