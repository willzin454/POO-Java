package br.ifpr.aula.construtores;
import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[2];
        
        for (int i = 0; i < 2; i ++){
            System.out.println("Informe o dia em que nasceu: " + (i+1));
            int diaNascimento = teclado.nextInt();
            System.out.println("Informe o mes em que nasceu: " + (i+1));
            int mesNascimento = teclado.nextInt();       
            System.out.println("Informe o ano em que nasceu: " + (i+1));
            int anoNascimento = teclado.nextInt();

            pessoas[i] = new Pessoa(diaNascimento, mesNascimento, anoNascimento);
        }

        for (int i = 0; i < 2; i ++){
            System.out.printf("Pessoa %d - Data de Nascimento: %02d/%02d/%04d - Idade: %d anos\n",
             i+1, pessoas[i].getdiaNascimento(), pessoas[i].getmesNascimento(), pessoas[i].getanoNascimento(),
             pessoas[i].getIdade());
        }
        teclado.close();
    }
}
