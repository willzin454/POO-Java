import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Scanner teclado = new  Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Informe o primeiro numero: ");
        double x = teclado.nextDouble();

        System.out.println("Informe o segundo numero: ");
        double y = teclado.nextDouble();

        double resposta = calculadora.dividir(x, y);
        imprimir(resposta);
    }
    static void imprimir(double x){
        System.out.println("Resultado: "+x);
    }
}
