package uniube.vendas;

public class MainPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(11, "Julia Silva", "26/03/2025");

        // Adicionando pedido
        pedido.adicionarItem(50.00);
        pedido.adicionarItem(30.00);

        // Removendo item
        pedido.removerItem(20.00);

        // Exibindo status e valor total
        System.out.println("\nStatus do pedido: " + pedido.getStatus());
        System.out.println("Valor total do pedido: R$ " + pedido.getValorTotal());

        // Finalizar pedido
        pedido.finalizarPedido();

        // Cancelar pedido
        pedido.cancelarPedido();

        // Exibindo status final do pedido
        System.out.println("\nStatus final: " + pedido.getStatus());
    }
}
