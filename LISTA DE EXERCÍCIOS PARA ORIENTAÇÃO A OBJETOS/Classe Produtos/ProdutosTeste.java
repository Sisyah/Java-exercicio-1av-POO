public class Main {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico("Smart TV", 1500.0, 2);
        Alimento alimento = new Alimento("Arroz", 10.0, "2023-02-28");

        System.out.println("Preço do Eletronico: " + eletronico.calcularPrecoComDesconto()); // Output: 1350.0
        System.out.println("Preço do Alimento: " + alimento.calcularPrecoComDesconto()); // Output: 10.0
    }
}