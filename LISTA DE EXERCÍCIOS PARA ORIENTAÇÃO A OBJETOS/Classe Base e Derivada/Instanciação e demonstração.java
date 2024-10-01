public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2015);
        Carro carro = new Carro("Honda", "Civic", 2018, 4);
        Moto moto = new Moto("Yamaha", "FZ6R", 2012, "Tipo de guidão esportivo");

        System.out.println("Veículo:");
        veiculo.exibirDetalhes();

        System.out.println("\nCarro:");
        carro.exibirDetalhes();

        System.out.println("\nMoto:");
        moto.exibirDetalhes();
    }
}