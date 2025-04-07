package trab01;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Professor que herda de Pessoa e implementa a interface Agendavel.
 * Representa um professor com informações de horários e disponibilidades.
 */
public class Professor extends Pessoa implements Agendavel {
    // Atributos
    private List<Horario> horarios; // Aulas agendadas
    private List<Horario> disponibilidades; // Disponibilidades informadas
    private static int totalProfessores = 0; // Contador de professores criados

    // Construtores
    public Professor(String nome, String cpf, Departamento departamento) {
        super(nome, cpf);
        this.horarios = new ArrayList<>();
        this.disponibilidades = new ArrayList<>();
        totalProfessores++;
    }

    /**
     * Construtor sobrecarregado para cenários de teste (apenas nome).
     */
    public Professor(String nome) {
        super(nome, "N/A");
        this.horarios = new ArrayList<>();
        this.disponibilidades = new ArrayList<>();
        totalProfessores++;
    }

    // Métodos de acesso (getters e setters)
    public List<Horario> getDisponibilidades() {
        return disponibilidades;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public String getNome() {
        return nome;
    }

    public static int getTotalProfessores() {
        return totalProfessores;
    }

    // Métodos de manipulação de horários e disponibilidades
    public void adicionarHorario(Horario horario) {
        this.horarios.add(horario);
    }

    public void adicionarDisponibilidade(Horario horario) {
        disponibilidades.add(horario);
    }

    // Implementação da interface Agendavel
    @Override
    public void agendar(Horario horario) {
        adicionarHorario(horario);
    }

    // Métodos de exibição
    @Override
    public void exibirInfo() {
        System.out.println("Professor: " + nome + " | CPF: " + cpf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor: ").append(nome).append("\n");
        for (Horario h : horarios) {
            sb.append(h.getDia()).append(" ")
                    .append(h.getHoraInicio()).append("-")
                    .append(h.getSala().getIdentificacao()).append("\n");
        }
        return sb.toString();
    }
}
