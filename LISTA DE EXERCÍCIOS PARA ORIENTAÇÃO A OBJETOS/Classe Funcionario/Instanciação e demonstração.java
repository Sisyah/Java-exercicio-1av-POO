public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João", 5000.0, 1000.0);
        Assistente assistente = new Assistente("Maria", 3000.0);

        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.calcularSalario());

        System.out.println("\nAssistente:");
        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário: " + assistente.calcularSalario());
    }
}