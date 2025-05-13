package br.com.fiap.bean;

import java.time.LocalDate;

public class Aluno {
    // Atributos
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;

    // Construtor padrão
    public Aluno() {
    }

    // Construtor com parâmetros
    public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
        setRegistroMatricula(registroMatricula);
        setNomeCompleto(nomeCompleto);
        setAnoDeNascimento(anoDeNascimento);
    }

    // Getters e Setters
    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula;
            } else {
                throw new Exception("Registro inválido! Deve estar entre 80000 e 599999.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        try {
            int anoAtual = LocalDate.now().getYear();
            if (anoDeNascimento >= 1945 && anoDeNascimento <= anoAtual) {
                this.anoDeNascimento = anoDeNascimento;
            } else {
                throw new Exception("Ano de nascimento inválido! Deve estar entre 1945 e " + anoAtual + ".");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Método específico: calcular idade a partir de um LocalDate
    public int calcularIdade(LocalDate dataAtual) {
        return dataAtual.getYear() - this.anoDeNascimento;
    }
}
