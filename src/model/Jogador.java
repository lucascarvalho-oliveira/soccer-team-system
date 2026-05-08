package model;

public class Jogador {
    protected String nome;
    protected String dataNascimento;

    public Jogador(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int numero(){
        return 0;
    }

    public String pocisao(){
        return nome;
    }

    public String toString(){
        return nome + ";" + dataNascimento;
    }
}
