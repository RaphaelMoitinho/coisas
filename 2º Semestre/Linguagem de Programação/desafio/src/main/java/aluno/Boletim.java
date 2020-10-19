package aluno;


public class Boletim {
    private  Double nota1;
    private  Double nota2;
    private  Double media;
    private  Double frequencia;
    private  String situacao;
    private  String cor;
              


    public void verificarSituacao(Double nota1, Double nota2, Double frequencia) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.frequencia = frequencia;
        
        this.calculaMedia();
        
        if (this.media > 9 && this.frequencia >90) {
            this.situacao = "ALuno aprovado com louvor";
            this.cor = "#0000AA";
        }else if(this.media >= 6 && this.frequencia >=75) {
            this.situacao = "ALuno aprovado";
            this.cor = "#00AA00";
        }else {
            this.situacao = "ALuno reprovado";
            this.cor = "#AA0000";
        }
    }

    private void calculaMedia(){
        this.media = (this.nota1 + this.nota2)/ 2;
    }
    
    public String getSituacao() {
        return situacao;
    }
    
    public String getCor() {
        return  cor;
    }
}