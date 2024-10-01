public class InteiroSetTeste {
    public static void main(String[] args) {

        InteiroSet conjunto1 = new InteiroSet();
        InteiroSet conjunto2 = new InteiroSet();

        conjunto1.insereElemento(1);
        conjunto1.insereElemento(2);
        conjunto1.insereElemento(3);

        conjunto2.insereElemento(2);
        conjunto2.insereElemento(3);
        conjunto2.insereElemento(4);

        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());

        InteiroSet conjuntoUniao = conjunto1.union(conjunto2);
        System.out.println("Conjunto União: " + conjuntoUniao.toSetString());

        InteiroSet conjuntoIntersecao = conjunto1.intersecao(conjunto2);
        System.out.println("Conjunto Interseção: " + conjuntoIntersecao.toSetString());

        System.out.println("Conjunto 1 é igual a Conjunto 2? " + conjunto1.ehIgualTo(conjunto2));
    }
}