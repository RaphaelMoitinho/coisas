/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

/**
 *
 * @author Aluno
 */
public class ContaCorrente {
    
    Double saldo = 0.0;
    String situacao = "";
    String cor = "#000";
    
    void depositar20 (){
        
        if ((saldo + 20) <= 600){ 
            saldo +=20;
            situacao();
        }
    }
    void sacar20(){
        
        if ((saldo -20)>= -200) {
            saldo -=20;
            situacao();
        }
    }
    void situacao(){
        if(saldo < 0){
            situacao = "Péssima";
            cor = "#AA0000";
        }else if (saldo < 0 && saldo < 400){
            situacao = "Controlada";
            cor = "#0000AA";
        }else {
            situacao = "Rei do camarote";
            cor = "#00AA00";
        }
    }
}   
   

