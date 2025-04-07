package trab01;

// Classe abstrata Pessoa que serve como base para outras classes
public abstract class Pessoa {
    // Atributos protegidos para serem acessados por subclasses
    protected String nome;
    protected String cpf;

    // Construtor para inicializar os atributos nome e cpf
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método para obter o CPF da pessoa
    public String getCpf() {
        return cpf;
    }

    // Método para alterar o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para alterar o CPF da pessoa
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void exibirInfo();

    // Método para retornar uma representação textual da pessoa
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
