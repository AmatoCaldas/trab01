package trab01;

import java.util.ArrayList;
import java.util.List;

// Classe que representa um Departamento
public class Departamento {
    // Nome do departamento
    private String nome;

    // Lista de professores associados ao departamento
    private List<Professor> professores;

    // Construtor que inicializa o nome do departamento e a lista de professores
    public Departamento(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    // Método para adicionar um professor à lista de professores
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    // Método para obter o nome do departamento
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do departamento
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a lista de professores do departamento
    public List<Professor> getProfessores() {
        return professores;
    }

    // Método para definir a lista de professores do departamento
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}
