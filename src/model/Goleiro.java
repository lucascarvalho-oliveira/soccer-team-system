package model;

public class Goleiro extends Jogador{
    private int nro_defesas;

    public Goleiro(int nro_defesas, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.nro_defesas = nro_defesas;
    }

    @Override
    public int numero(){
        return nro_defesas;
    }

    @Override
    public String pocisao(){
        return "Goleiro";
    }

    @Override
    public String toString() {
        return "Goleiro;" + nome + ";" + dataNascimento + ";" + nro_defesas;
    }
}
