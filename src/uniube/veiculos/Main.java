package uniube.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020, 50000, 85000.00);

        System.out.println("Iniciando uma viagem...");
        meuCarro.acelerar(300);

        meuCarro.frear();

        meuCarro.atualizarPreco(82000.00);

        System.out.println("\nDados atualizados do carro:");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Quilometragem: " + meuCarro.getKilometragem() + " km");
        System.out.println("Preço: R$ " + meuCarro.getPreco());
    }
}
