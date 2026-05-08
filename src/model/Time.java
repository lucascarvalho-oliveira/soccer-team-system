package model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private int identificador;
    private List<Jogador> jogadores;

    public Time(String nome, int identificador){
        this.nome = nome;
        this.identificador = identificador;

        this.jogadores = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    @Override
    public String toString() {
        return "\nJogadores " + jogadores;
    }
}
