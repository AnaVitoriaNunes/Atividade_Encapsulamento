package uniube.vendas;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos", 0.0);


        System.out.println("Valor total do estoque inicial: R$ " + produto.calcularValorTotal());

        System.out.println();
        produto.aplicarDesconto(10);

        System.out.println();
        produto.aumentarEstoque(5);

        System.out.println("\nValor total do estoque após aumento: R$ " + produto.calcularValorTotal());
    }
}
