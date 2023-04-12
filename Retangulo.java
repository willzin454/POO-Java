public class Retangulo {
    Double largura;
    Double altura;

    public Retangulo(Double largura, Double altura){
        this.largura = largura;
        this.altura = altura;
    }
    public double calcularArea(){
        return this.largura*this.altura;
    }
}
