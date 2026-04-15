package bo;

import dao.TimeDao;
import model.Jogador;
import model.Time;

public class TimeBO {
    private TimeDao timeDao;

    public TimeBO(){
        this.timeDao = new TimeDao();
    }

    public void salvarTime(Time time) throws Exception {
        if(time.getNome() == null || time.getNome().trim().isEmpty()){
            throw new IllegalArgumentException("Nome do time invalido");
        }
        if(time.getIdentificador() < 100 || time.getIdentificador() > 200){
            throw new IllegalArgumentException("Identificador incorreto");
        }

        for(Jogador j: time.getJogadores()) {
            if (j.getDataNascimento() == null || j.getDataNascimento().trim().isEmpty()) {
                throw new IllegalArgumentException("Data de nascimento incorreto");
            }
            if (j.getNome() == null || j.getNome().trim().isEmpty()) {
                throw new IllegalArgumentException("Nome do jogador invalido");
            }
            if (j.numero() < 0 || j.numero() > 1000) {
                throw new IllegalArgumentException("Valor numérico (gols/defesas) inválido para: " + j.getNome());
            }
        }

        timeDao.salvarTime(time);
    }
}
