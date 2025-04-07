package trab01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ==========================
        // Testando a classe Sala
        // ==========================
        Sala sala1 = new Sala("101");
        Sala sala2 = new Sala("102");

        Horario horario1 = new Horario(DiaSemana.SEGUNDA, "08:00", sala1);
        Horario horario2 = new Horario(DiaSemana.SEGUNDA, "10:00", sala1);
        Horario horario3 = new Horario(DiaSemana.TERCA, "08:00", sala2);
        Horario horario4 = new Horario(DiaSemana.TERCA, "10:00", sala2);

        sala1.adicionarHorario(horario1);
        sala1.adicionarHorario(horario2);
        sala2.adicionarHorario(horario3);
        sala2.adicionarHorario(horario4);

        System.out.println("Salas e horários disponíveis:");
        System.out.println(sala1.getIdentificacao() + ": " + sala1.getHorariosDisponiveis());
        System.out.println(sala2.getIdentificacao() + ": " + sala2.getHorariosDisponiveis());

        // ==========================
        // Testando a classe Professor
        // ==========================
        Departamento departamento = new Departamento("Ciência da Computação");
        Professor professor1 = new Professor("Carlos", "123.456.789-00", departamento);
        Professor professor2 = new Professor("Ana", "987.654.321-00", departamento);

        professor1.adicionarDisponibilidade(horario1);
        professor1.adicionarDisponibilidade(horario3);
        professor2.adicionarDisponibilidade(horario2);
        professor2.adicionarDisponibilidade(horario4);

        departamento.adicionarProfessor(professor1);
        departamento.adicionarProfessor(professor2);

        System.out.println("\nProfessores e suas disponibilidades:");
        for (Professor professor : departamento.getProfessores()) {
            System.out.println(professor.getNome() + ": " + professor.getDisponibilidades());
        }

        // ==========================
        // Testando a classe GeradorDeGrade
        // ==========================
        List<Professor> professores = new ArrayList<>();
        professores.add(professor1);
        professores.add(professor2);

        GeradorDeGrade gerador = new GeradorDeGrade();
        gerador.gerarAulas(professores);

        System.out.println("\nGrade horária gerada:");
        for (Professor professor : professores) {
            System.out.println(professor);
        }

        // ==========================
        // Testando a classe ColecaoGenerica
        // ==========================
        ColecaoGenerica<Sala> colecaoSalas = new ColecaoGenerica<>();
        colecaoSalas.adicionar(sala1);
        colecaoSalas.adicionar(sala2);

        System.out.println("\nSalas na coleção genérica:");
        for (int i = 0; i < 2; i++) {
            System.out.println(colecaoSalas.obter(i));
        }

        // ==========================
        // Testando a interface Agendavel
        // ==========================
        System.out.println("\nAgendando horários para professores:");
        professor1.agendar(horario1);
        professor2.agendar(horario2);

        System.out.println(professor1.getNome() + " - Horários agendados: " + professor1.getHorarios());
        System.out.println(professor2.getNome() + " - Horários agendados: " + professor2.getHorarios());
    }
}
