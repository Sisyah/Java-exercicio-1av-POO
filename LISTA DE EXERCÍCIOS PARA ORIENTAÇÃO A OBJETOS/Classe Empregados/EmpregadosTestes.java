package src.Empregado;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    public double aumentoEmPorcentagem() {
        return getSalarioAnual() * 1.1;
    }
}

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Samuel", "Rosário", 3584.25);
        imprimirInformacoes(empregado1);

        System.out.println("================================================================================");

        Empregado empregado2 = new Empregado("Eduardo", "Gonçalves", 2594.25);
        imprimirInformacoes(empregado2);
    }

    public static void imprimirInformacoes(Empregado empregado) {
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Sobrenome: " + empregado.getSobrenome());
        System.out.println("Salario Mensal: " + empregado.getSalarioMensal());
        System.out.println("Salario Anual: " + empregado.getSalarioAnual());
        System.out.println("Salario Anual + 10%: " + empregado.aumentoEmPorcentagem());
    }
}