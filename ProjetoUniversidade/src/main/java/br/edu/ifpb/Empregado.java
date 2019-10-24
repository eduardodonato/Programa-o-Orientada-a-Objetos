package br.edu.ifpb;

public class Empregado {
    protected int idade;
    protected String nome;
    protected int matricula;
    protected double salario;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregado(int idade, String nome, int matricula, double salario) {
        this.idade = idade;
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public Empregado() {
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
