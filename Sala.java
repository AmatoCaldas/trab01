package trab01;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma sala
public class Sala {
    // Identificação única da sala
    private String identificacao;

    // Lista de horários disponíveis para utilização da sala
    private List<Horario> horariosDisponiveis;

    // Construtor que inicializa a sala com uma identificação
    public Sala(String identificacao) {
        this.identificacao = identificacao;
        this.horariosDisponiveis = new ArrayList<>();
    }

    // Retorna a identificação da sala
    public String getIdentificacao() {
        return identificacao;
    }

    // Define uma nova identificação para a sala
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    // Adiciona um horário disponível à lista de horários da sala
    public void adicionarHorario(Horario horario) {
        horariosDisponiveis.add(horario);
    }

    // Retorna a lista de horários disponíveis da sala
    public List<Horario> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    // Retorna uma representação textual da sala
    public String toString() {
        return "Sala " + identificacao;
    }
}
