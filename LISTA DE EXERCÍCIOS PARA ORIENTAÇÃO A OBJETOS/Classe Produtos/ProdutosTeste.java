package src.Produtos;

public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void imprimirInformacoes();
}

public class Alimento extends Produto {
    private String dataDeValidade;

    public Alimento(String nome, double preco, String dataDeValidade) {
        super(nome, preco);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Validade: " + dataDeValidade);
    }
}

public class Eletronico extends Produto {
    private int garantia;

    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Garantia: " + garantia + " anos");
    }
}

public class Loja {
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento("Banana", 6, "12/10/2024");
        alimento1.imprimirInformacoes();

        System.out.println("===========================================================");

        Eletronico eletronico1 = new Eletronico("Monitor", 230, 3);
        eletronico1.imprimirInformacoes();
    }
}