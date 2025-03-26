package uniube.pessoas;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, String cpf, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public void fazerAniversario() {
        this.idade += 1;
        System.out.println("Feliz aniversário! Agora você tem " + this.idade + " anos.");
    }
}
