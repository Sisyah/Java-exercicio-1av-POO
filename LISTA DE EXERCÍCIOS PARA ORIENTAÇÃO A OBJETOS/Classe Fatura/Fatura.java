public class Fatura {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoPorItem;

    public Fatura(String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;

        if (quantidadeComprada <= 0) {
            this.quantidadeComprada = 0;
        }
        if (precoPorItem <= 0) {
            this.precoPorItem = 0;
        }
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
        if (quantidadeComprada <= 0) {
            this.quantidadeComprada = 0;
        }
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
        if (precoPorItem <= 0) {
            this.precoPorItem = 0;
        }
    }

    public double getTotalFatura() {
        return quantidadeComprada * precoPorItem;
    }
}