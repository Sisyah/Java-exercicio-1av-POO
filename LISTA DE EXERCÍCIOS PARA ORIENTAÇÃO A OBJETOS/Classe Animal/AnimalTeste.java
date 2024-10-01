public class AnimaisTeste {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("pit");
        cachorro1.setIdade(9);

        imprimirInformacoes(cachorro1);

        System.out.println("==============================================================");

        Gato gato1 = new Gato();
        gato1.setNome("Magrelo");
        gato1.setIdade(4);

        imprimirInformacoes(gato1);
    }

    public static void imprimirInformacoes(Animal animal) {
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Som do animal: " + animal.emitirSom());
    }
}