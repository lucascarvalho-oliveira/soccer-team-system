package model;

public class Atacante extends Jogador{
    private int nro_gols;

    public Atacante(int nro_gols, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.nro_gols = nro_gols;
    }

    @Override
    public int numero(){
        return nro_gols;
    }

    @Override
    public String pocisao(){
        return "Atacante";
    }

    @Override
    public String toString() {
        return "Atacante;" + nome + ";" + dataNascimento + ";" + nro_gols;
    }
}
