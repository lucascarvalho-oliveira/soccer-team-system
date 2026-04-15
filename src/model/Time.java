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

    public int getIdentificador(){
        return identificador;
    }

    public String getNome(){
        return nome;
    }

    public void addList(Jogador jogador){
        jogadores.add(jogador);
    }

    public List<Jogador> getJogadores(){
        return jogadores;
    }
}
