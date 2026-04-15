package model;

public class Jogador {
    protected String nome;
    protected String dataNascimento;

    public Jogador(){}

    public Jogador(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public int numero(){
        return 0;
    }

    public String toString(){
        return nome;
    }
}
