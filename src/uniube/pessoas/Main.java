package uniube.pessoas;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana Nunes", 20, "123.456.789-00", 1.65, 64.0);

        //Dados iniciais
        System.out.println("Dados iniciais:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Altura: " + pessoa.getAltura() + " m");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");

        // Aniversário
        pessoa.fazerAniversario();

        // Calculando IMC
        double imc = pessoa.calcularIMC();
        System.out.printf("O IMC de %s é %.2f%n", pessoa.getNome(), imc);
    }
}
