public class Alimento extends Produto {
    private String dataDeValidade;

    public Alimento(String nome, double preco, String dataDeValidade) {
        super(nome, preco);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

}