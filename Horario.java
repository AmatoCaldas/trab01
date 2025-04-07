package trab01;

import java.util.Comparator;

// Classe que representa um horário, contendo informações sobre o dia da semana, hora de início e sala
public class Horario {
    private DiaSemana dia; // Dia da semana associado ao horário
    private String horaInicio; // Hora de início no formato String
    private Sala sala; // Sala associada ao horário

    // Construtor para inicializar os atributos da classe
    public Horario(DiaSemana dia, String horaInicio, Sala sala) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.sala = sala;
    }

    // Métodos getters para acessar os atributos da classe
    public DiaSemana getDia() {
        return dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public Sala getSala() {
        return sala;
    }

    // Métodos setters para modificar os atributos da classe
    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    // Método estático que retorna um comparador para ordenar objetos Horario
    // Primeiro pelo dia da semana (ordem ordinal) e depois pela hora de início
    public static Comparator<Horario> comparadorPorDiaEHora() {
        return Comparator
                .comparing((Horario h) -> h.getDia().ordinal()) // Compara pelo dia da semana
                .thenComparing(Horario::getHoraInicio); // Em caso de empate, compara pela hora de início
    }

    // Método que retorna uma representação em String do objeto Horario
    @Override
    public String toString() {
        return dia + " " + horaInicio + " (Sala: " + sala.getIdentificacao() + ")";
    }
}
