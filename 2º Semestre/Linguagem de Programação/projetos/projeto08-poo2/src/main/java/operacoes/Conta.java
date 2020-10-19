
package operacoes;


public class Conta {
    
    private Integer saldo = 0;
    private Integer trasacoes = 0;
    
    public void comprarCarro(Integer valorDoCarro){
        saldo += valorDoCarro;
    }
    
    public void comprarMoto(Integer valorDaMoto){
        saldo -=valorDaMoto;
    }
    
    public Integer getSaldo() {
        return saldo;
    }
    
    public Integer getTrasacoes(){
        return trasacoes;
    }
    
}
