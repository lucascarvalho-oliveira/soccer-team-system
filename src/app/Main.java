package app;

import service.TimeService;
import dao.TimeDao;
import model.Atacante;
import model.Goleiro;
import model.Jogador;
import model.Time;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeDao dao = new TimeDao();
        boolean sair = false;

        while(!sair){
            System.out.println("1 - Adicionar time:");
            System.out.println("2 - Consultar por identificador:");
            System.out.println("3 - remover time:");
            System.out.println("4 - sair:");
            int menu = sc.nextInt();sc.nextLine();
            System.out.println();

            try{
                switch(menu){
                    case 1:
                        System.out.println("Qual o nome do time:");
                        String nome = sc.nextLine();
                        System.out.println("Qual o código identificador código acima de 100:");
                        int codigo = sc.nextInt();
                        sc.nextLine();

                        Time time = new Time(nome, codigo);

                        System.out.println("Quantos jogadores serão adicionado:");
                        int quantidade = sc.nextInt();sc.nextLine();
                        System.out.println();

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

                                Jogador jogador = new Atacante(nro_gols, nomeJogador, data);
                                time.getJogadores().add(jogador);
                            }
                            if(opcao_2 == 2){
                                System.out.println("Quantas devesas marcadas:");
                                int nro_devesas = sc.nextInt();sc.nextLine();

                                Jogador jogador = new Goleiro(nro_devesas, nomeJogador, data);
                                time.getJogadores().add(jogador);
                            }
                            System.out.println();
                        }

                        TimeService bo = new TimeService(dao);

                        try{
                            System.out.println("Validando...");
                            bo.salvarTime(time);
                            System.out.println("Time salvo com sucesso!!");
                            System.out.println();

                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                        break;

                    case 2:
                        System.out.println("Digite o código do time para a consulta:");
                        int busca = sc.nextInt();sc.nextLine();
                        System.out.println();

                        Map<Integer, Time> mapa = dao.buscarTime();

                        if(mapa.containsKey(busca)){
                            Time t = mapa.get(busca);
                            System.out.println("Time encontrado");
                            System.out.println("nome: " + t.getNome());
                            System.out.println("Jogadores:");
                            for(Jogador j : t.getJogadores()){
                                System.out.println(" - " + j.getNome() + " | " + j.pocisao() + " | INFO: " + j.numero());
                                System.out.println();
                            }
                        }else{
                            System.out.println("Time com código " + busca + " não encontrado.");
                            break;
                        }

                    case 3:
                        System.out.println("Digite o código do time para a consulta:");
                        int buscaId = sc.nextInt();sc.nextLine();
                        System.out.println();


                        Map<Integer, Time> mapaDelete = dao.buscarTime();

                        if(mapaDelete.containsKey(buscaId)){
                            Time t = mapaDelete.get(buscaId);
                            System.out.println("Time encontrado");
                            System.out.println("nome: " + t.getNome());
                            System.out.println();
                        }else{
                            System.out.println("Time com código " + buscaId + " não encontrado.");
                            System.out.println();
                            break;
                        }

                        System.out.println("Deseja apagar ?");
                        System.out.println("1 - sim | 2 - nao");
                        int escolha = sc.nextInt();sc.nextLine();
                        System.out.println();

                        if(escolha == 1){
                            mapaDelete.remove(buscaId);
                            dao.reescreverArquivo(mapaDelete);
                            System.out.println("Time removido com sucesso");
                            System.out.println();
                        }else{
                            System.out.println("Não encontrado");
                            System.out.println();
                            break;
                        }
                        break;

                    case 4:
                        System.out.println("Encerrando sistema...");
                        sair = true;
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        System.out.println();
                        break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
