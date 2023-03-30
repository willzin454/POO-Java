package br.ifpr.aula.construtores;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    int idade;

    public Pessoa(int diaNascimento, int mesNascimento, int anoNascimento){
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.idade = calcularIdade();
    }
    
    private int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(this.diaNascimento, this.mesNascimento, this.anoNascimento);
        return Period.between(dataNascimento, hoje).getYears();
    }

    public int getdiaNascimento(){
        return diaNascimento;
    }

    public int getmesNascimento(){
        return mesNascimento;
    }
    
    public int getanoNascimento(){
        return anoNascimento;
    }

    public int getIdade(){
        return idade;
    }
}
