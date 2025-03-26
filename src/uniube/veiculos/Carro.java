package uniube.veiculos;

public class Carro {
    private String marca;

    public Carro(String marca, String modelo, int ano, int kilometragem, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
        this.preco = preco;
    }

    private String modelo;
    private int ano;
    private int kilometragem;
    private double preco;



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void acelerar(int km) {
        if (km > 0) {
            this.kilometragem += km;
            System.out.println("O carro andou " + km + " km. Quilometragem total: " + this.kilometragem + " km.");
        } else {
            System.out.println("A distância deve ser maior que zero.");
        }
    }

    public void frear() {
        System.out.println("O carro está parando...");
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
            System.out.println("O novo preço do carro é R$ " + this.preco);
        } else {
            System.out.println("O preço deve ser maior que zero.");
        }
    }
    }