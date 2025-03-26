package uniube.vendas;

public class Pedido {
    private  int numeroPedido;
    private  String cliente;
    private  String data;
    private  Double valorTotal;
    private  String status;

    public Pedido(int numeroPedido, String cliente, String data) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = 0.0;
        this.status = "Em andamento";
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void adicionarItem(double valor) {
        if (valor > 0) {
            this.valorTotal += valor;
            System.out.println("Item de R$ " + valor + " adicionado ao pedido.");
        } else {
            System.out.println("Valor inválido! Não foi possível adicionar o item.");
        }
    }

    public void removerItem(double valor) {
        if (valor > 0 && valor <= this.valorTotal) {
            this.valorTotal -= valor;
            System.out.println("Item de R$ " + valor + " removido do pedido.");
        } else {
            System.out.println("Valor inválido ou maior que o total do pedido! Não foi possível remover.");
        }
    }

    public void finalizarPedido() {
        if (!this.status.equals("Finalizado") && !this.status.equals("Cancelado")) {
            this.status = "Finalizado";
            System.out.println("Pedido finalizado com sucesso! Valor total: R$ " + this.valorTotal);
        } else {
            System.out.println("O pedido já foi finalizado ou cancelado.");
        }
    }

    public void cancelarPedido() {
        if (!this.status.equals("Finalizado")) {
            this.status = "Cancelado";
            this.valorTotal = 0.0; // Reseta o valor total
            System.out.println("Pedido cancelado.");
        } else {
            System.out.println("Não é possível cancelar um pedido já finalizado.");
        }
    }

}
