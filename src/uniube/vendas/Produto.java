package uniube.vendas;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;
    private double desconto;

    public Produto(String nome, double preco, int quantidade, String categoria, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            this.preco -= this.preco * (porcentagem / 100);
            System.out.println("Desconto de " + porcentagem + "% aplicado. Novo preço unitário: R$ " + this.preco);
        } else {
            System.out.println("Desconto inválido! Deve estar entre 0 e 100.");
        }
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Estoque aumentado em " + quantidade + " unidades. Estoque total: " + this.quantidade);
        } else {
            System.out.println("Quantidade inválida para aumento de estoque.");
        }
    }
}
