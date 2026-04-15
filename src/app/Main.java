package app;

import bo.TimeBO;
import dao.TimeDao;
import model.Atacante;
import model.Goleiro;
import model.Jogador;
import model.Time;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TimeDao dao = new TimeDao();

        int opcao;
        do{
            System.out.println("1 - Adicionar Time:");
            System.out.println("2 - Consultar por identificador:");
            System.out.println("0 - sair:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Qual o nome do time:");
                    String nome = sc.nextLine();
                    System.out.println("Qual o código identificador (código acima de 100):");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    Time time = new Time(nome, codigo);

                    System.out.println("Quantos jogadores serão adicionado:");
                    int quantidade = sc.nextInt();sc.nextLine();

                    for(int i = 0; i < quantidade; i++){
                        System.out.println("Nome do jogador:");
                        String nomeJogador = sc.nextLine();
                        System.out.println("Data de nascimento:");
                        String data = sc.nextLine();
                        System.out.println("Qual posição:");
                        System.out.println("1 - Atacante | 2 - Goleiro");
                        int opcao_2 = sc.nextInt(); sc.nextLine();

                        if(opcao_2 == 1){
                            System.out.println("Quantidade de gols marcados:");
                            int nro_gols = sc.nextInt();sc.nextLine();

                            Jogador jogador = new Atacante(nomeJogador, data, nro_gols);
                            time.addList(jogador);
                        }
                        if(opcao_2 == 2){
                            System.out.println("Quantas devesas marcadas:");
                            int nro_devesas = sc.nextInt();sc.nextLine();

                            Jogador jogador = new Goleiro(nomeJogador, data, nro_devesas);
                            time.addList(jogador);
                        }
                    }

                    TimeBO bo = new TimeBO();

                    try{
                        System.out.println("Validando...");
                        bo.salvarTime(time);
                        System.out.println("Time salvo com sucesso!!");

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:
                    System.out.println("Digite o código do time para a consulta:");
                    int busca = sc.nextInt();sc.nextLine();

                    Map<Integer, Time> mapa = dao.buscarTime();

                    if(mapa.containsKey(busca)){
                        Time t = mapa.get(busca);
                        System.out.println("Time encontrado");
                        System.out.println("nome: " + t.getNome());
                        System.out.println("Jogadores:");
                        for(Jogador j : t.getJogadores()){
                            System.out.println(" - " + j.getNome() + " | INFO: " + j.numero());
                        }
                    }else{
                        System.out.println("Time com código " + busca + " não encontrado.");
                    }

                    break;
            }

        }while(opcao != 0);

        System.out.println("Programa finalizado");

        sc.close();
    }
}
