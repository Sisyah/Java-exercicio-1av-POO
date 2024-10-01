public class FaturaTeste {
    public static void main(String[] args) {

        Fatura fatura = new Fatura("PRD001", "Mouse óptico", 2, 50.0);

        System.out.println("Código do produto: " + fatura.getCodigoProduto());
        System.out.println("Descrição do produto: " + fatura.getDescricaoProduto());
        System.out.println("Quantidade comprada: " + fatura.getQuantidadeComprada());
        System.out.println("Preço por item: " + fatura.getPrecoPorItem());

        System.out.println("Valor total da fatura: " + fatura.getTotalFatura());
    }
}